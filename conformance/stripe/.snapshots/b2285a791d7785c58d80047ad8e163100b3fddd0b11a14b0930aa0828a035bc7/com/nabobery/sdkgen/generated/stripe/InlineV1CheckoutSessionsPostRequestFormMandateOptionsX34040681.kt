package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681(
  public val referencePrefix:
      InlineV1CheckoutSessionsPostRequestFormReferencePrefixXf1f9aeb5? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1CheckoutSessionsPostRequestFormReferencePrefixXf1f9aeb5? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681 = InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormReferencePrefixXf1f9aeb5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681(block: InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681 = InlineV1CheckoutSessionsPostRequestFormMandateOptionsX34040681.build(block)
