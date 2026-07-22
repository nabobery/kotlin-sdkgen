package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class DeletedTaxIdView(
    public val deleted: Boolean,
    public val id: String,
    @SerialName("object")
    public val objectValue: InlineDeletedTaxIdObjectValueX0eb6fde6,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_tax_id
 */
@Serializable(with = DeletedTaxId.Serializer::class)
public class DeletedTaxId(
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
    public val objectValue: InlineDeletedTaxIdObjectValueX0eb6fde6,
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

        private var objectValueValue: InlineDeletedTaxIdObjectValueX0eb6fde6? = null

        public var objectValue: InlineDeletedTaxIdObjectValueX0eb6fde6
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): DeletedTaxId {
            check(deletedValue != null) { "deleted is required" }
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return DeletedTaxId(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DeletedTaxId = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DeletedTaxId> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DeletedTaxId {
            val jsonDecoder = decoder.requireJsonDecoder("DeletedTaxId")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DeletedTaxId must be a JSON object")
            val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineDeletedTaxIdObjectValueX0eb6fde6>(rawObject, "object")
            return DeletedTaxId(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DeletedTaxId,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DeletedTaxId")
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

public fun deletedTaxId(block: DeletedTaxId.Builder.() -> Unit): DeletedTaxId = DeletedTaxId.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("DeletedTaxId is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
