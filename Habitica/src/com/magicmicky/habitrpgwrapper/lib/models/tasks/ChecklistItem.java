package com.magicmicky.habitrpgwrapper.lib.models.tasks;

import com.habitrpg.android.habitica.HabitDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;

/**
 * Created by viirus on 06/07/15.
 */
@Table(databaseName = HabitDatabase.NAME)
public class ChecklistItem extends BaseModel {

    @Column
    @PrimaryKey
    private String id;

    @Column
    private String text;

    @Column
    private boolean completed;

    /*@Column
    @ForeignKey(
            references = {@ForeignKeyReference(columnName = "checklist_id",
                    columnType = String.class,
                    foreignColumnName = "id")},
            saveForeignKeyModel = false)*/
    ForeignKeyContainer<Checklist> queenModelContainer;

    public ChecklistItem() {
        this(null,null);
    }
    public ChecklistItem(String id, String text) {
        this(id,text,false);
    }
    public ChecklistItem(String id,String text, boolean completed) {
        this.setText(text);
        this.setId(id);
        this.setCompleted(completed);
    }
    public ChecklistItem(String s) {
        this(null,s);
    }
    public ChecklistItem(ChecklistItem item) {
        this.text = item.getText();
        this.id= item.getId();
        this.completed=item.getCompleted();
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
