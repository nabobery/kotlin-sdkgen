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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_invoiceitem
 */
@Serializable(with = DeletedInvoiceitem.Serializer::class)
public class DeletedInvoiceitem(
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
    public val objectValue: InlineDeletedInvoiceitemObjectValueXe7579b5e,
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

        private var objectValueValue: InlineDeletedInvoiceitemObjectValueXe7579b5e? = null

        public var objectValue: InlineDeletedInvoiceitemObjectValueXe7579b5e
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): DeletedInvoiceitem {
            check(deletedValue != null) { "deleted is required" }
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return DeletedInvoiceitem(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DeletedInvoiceitem = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DeletedInvoiceitem> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DeletedInvoiceitem {
            val jsonDecoder = decoder.requireJsonDecoder("DeletedInvoiceitem")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("DeletedInvoiceitem must be a JSON object")
            val deleted = json.decodeRequired<Boolean>(rawObject, "deleted")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineDeletedInvoiceitemObjectValueXe7579b5e>(rawObject, "object")
            return DeletedInvoiceitem(
                deleted = deleted,
                id = id,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DeletedInvoiceitem,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DeletedInvoiceitem")
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

public fun deletedInvoiceitem(block: DeletedInvoiceitem.Builder.() -> Unit): DeletedInvoiceitem =
    DeletedInvoiceitem.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("DeletedInvoiceitem is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
