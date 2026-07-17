package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode

internal object EffectiveDiff {
    fun between(
        before: JsonNode,
        after: JsonNode,
    ): List<EffectiveChange> {
        val changes = mutableListOf<EffectiveChange>()
        compare("", before, after, changes)
        return changes.sortedBy { it.pointer }
    }

    private fun compare(
        pointer: String,
        before: JsonNode,
        after: JsonNode,
        changes: MutableList<EffectiveChange>,
    ) {
        if (before == after) return
        if (before.isObject && after.isObject) {
            val names = (before.fieldNames().asSequence().toSet() + after.fieldNames().asSequence().toSet()).sorted()
            for (name in names) {
                val childPointer = JsonPointerSupport.child(pointer, name)
                val oldValue = before.get(name)
                val newValue = after.get(name)
                when {
                    oldValue == null -> {
                        changes +=
                            EffectiveChange(childPointer, ChangeKind.ADD, null, newValue.deepCopy())
                    }

                    newValue == null -> {
                        changes +=
                            EffectiveChange(childPointer, ChangeKind.REMOVE, oldValue.deepCopy(), null)
                    }

                    else -> {
                        compare(childPointer, oldValue, newValue, changes)
                    }
                }
            }
            return
        }
        changes += EffectiveChange(pointer, ChangeKind.REPLACE, before.deepCopy(), after.deepCopy())
    }
}
