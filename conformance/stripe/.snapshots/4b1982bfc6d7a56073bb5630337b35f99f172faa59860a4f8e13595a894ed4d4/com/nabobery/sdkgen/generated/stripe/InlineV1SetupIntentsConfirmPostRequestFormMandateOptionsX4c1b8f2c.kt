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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c(
  public val referencePrefix:
      InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a?
        = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c(block: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c = InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsX4c1b8f2c.build(block)
