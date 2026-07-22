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
public data class DeletedInvoiceView(
    public val deleted: Boolean,
    public val id: String,
    @SerialName("object")
    public val objectValue: InlineDeletedInvoiceObjectValueXaf8c3dcd,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_invoice
 */
@Serializable(with = DeletedInvoice.Serializer::class)
public class DeletedInvoice(
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
    public val objectValue: InlineDeletedInvoiceObjectValueXaf8c3dcd,
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

        private var objectValueValue: InlineDeletedInvoiceObjectValueXaf8c3dcd? = null

        public var objectValue: InlineDeletedInvoiceObjectValueXaf8c3dcd
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): DeletedInvoice {
            check(deletedValue != null) { "deleted is required" }
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return DeletedInvoice(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DeletedInvoice = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DeletedInvoice> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DeletedInvoice {
            val jsonDecoder = decoder.requireJsonDecoder("DeletedInvoice")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DeletedInvoice must be a JSON object")
            val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineDeletedInvoiceObjectValueXaf8c3dcd>(rawObject, "object")
            return DeletedInvoice(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DeletedInvoice,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DeletedInvoice")
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

public fun deletedInvoice(block: DeletedInvoice.Builder.() -> Unit): DeletedInvoice = DeletedInvoice.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("DeletedInvoice is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
