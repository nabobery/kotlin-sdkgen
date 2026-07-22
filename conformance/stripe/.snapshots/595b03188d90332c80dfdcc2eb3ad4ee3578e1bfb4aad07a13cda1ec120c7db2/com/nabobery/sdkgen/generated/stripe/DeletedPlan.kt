package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_plan
 */
@Serializable(with = DeletedPlan.Serializer::class)
public class DeletedPlan(
    /**
     * Always true for a deleted object
     */
    public val deleted: Boolean,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineDeletedPlanObjectValueXb9fa5cd2,
) {
    public class Builder {
        private var deletedValue: Boolean? = null

        public var deleted: Boolean
            get() = requireNotNull(deletedValue) { "deleted is required" }
            set(`value`) {
                deletedValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var objectValueValue: InlineDeletedPlanObjectValueXb9fa5cd2? = null

        public var objectValue: InlineDeletedPlanObjectValueXb9fa5cd2
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): DeletedPlan {
            check(deletedValue != null) { "deleted is required" }
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return DeletedPlan(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DeletedPlan = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DeletedPlan> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DeletedPlan {
            val jsonDecoder = decoder.requireJsonDecoder("DeletedPlan")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DeletedPlan must be a JSON object")
            val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineDeletedPlanObjectValueXb9fa5cd2>(rawObject, "object")
            return DeletedPlan(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DeletedPlan,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DeletedPlan")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("deleted", json.encodeToJsonElement(value.deleted))
                    put("id", value.id)
                    put("object", json.encodeToJsonElement(value.objectValue))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun deletedPlan(block: DeletedPlan.Builder.() -> Unit): DeletedPlan = DeletedPlan.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("DeletedPlan is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
