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
 * An active entitlement describes access to a feature for a customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/entitlements.active_entitlement
 */
@Serializable(with = EntitlementsActiveEntitlement.Serializer::class)
public class EntitlementsActiveEntitlement(
    /**
     * The [Feature](https://docs.stripe.com/api/entitlements/feature) that the customer is entitled to.
     */
    public val feature: InlineEntitlementsActiveEntitlementFeatureXabd7c79b,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * A unique key you provide as your own system identifier. This may be up to 80 characters.
     */
    public val lookupKey: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineEntitlementsActiveEntitlementObjectValueX098f8f09,
) {
    public class Builder {
        private var featureValue: InlineEntitlementsActiveEntitlementFeatureXabd7c79b? = null

        public var feature: InlineEntitlementsActiveEntitlementFeatureXabd7c79b
            get() = requireNotNull(featureValue) { "feature is required" }
            set(`value`) {
                featureValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var lookupKeyValue: String? = null

        public var lookupKey: String
            get() = requireNotNull(lookupKeyValue) { "lookupKey is required" }
            set(`value`) {
                lookupKeyValue = value
            }

        private var objectValueValue: InlineEntitlementsActiveEntitlementObjectValueX098f8f09? = null

        public var objectValue: InlineEntitlementsActiveEntitlementObjectValueX098f8f09
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        public fun build(): EntitlementsActiveEntitlement {
            check(featureValue != null) { "feature is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(lookupKeyValue != null) { "lookupKey is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return EntitlementsActiveEntitlement(
                feature = feature,
                id = id,
                livemode = livemode,
                lookupKey = lookupKey,
                objectValue = objectValue,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): EntitlementsActiveEntitlement = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<EntitlementsActiveEntitlement> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): EntitlementsActiveEntitlement {
            val jsonDecoder = decoder.requireJsonDecoder("EntitlementsActiveEntitlement")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("EntitlementsActiveEntitlement must be a JSON object")
            val feature = json.decodeRequired<InlineEntitlementsActiveEntitlementFeatureXabd7c79b>(rawObject, "feature")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val lookupKey = json.decodeRequired<String>(rawObject, "lookup_key")
            val objectValue =
                json.decodeRequired<InlineEntitlementsActiveEntitlementObjectValueX098f8f09>(
                    rawObject,
                    "object",
                )
            return EntitlementsActiveEntitlement(
                feature = feature,
                id = id,
                livemode = livemode,
                lookupKey = lookupKey,
                objectValue = objectValue,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: EntitlementsActiveEntitlement,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("EntitlementsActiveEntitlement")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("feature", json.encodeToJsonElement(value.feature))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("lookup_key", value.lookupKey)
                    put("object", json.encodeToJsonElement(value.objectValue))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun entitlementsActiveEntitlement(
    block: EntitlementsActiveEntitlement.Builder.() -> Unit,
): EntitlementsActiveEntitlement = EntitlementsActiveEntitlement.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("EntitlementsActiveEntitlement is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
