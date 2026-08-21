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
 * ded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9(
  public val referencePrefix:
      InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9 = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9(block: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9 = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXbe2a64e9.build(block)
