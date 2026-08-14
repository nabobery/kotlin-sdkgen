package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a(
  public val referencePrefix:
      InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2?
        = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a(block: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX7e18ed2a.build(block)
