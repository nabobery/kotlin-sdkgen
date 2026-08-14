package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Configuration overrides for this setup, such as MOTO and customer cancellation settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_setup_intent/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/process_config
 */
@Serializable(with = InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47.Serializer::class)
public class InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47(
  public val enableCustomerCancellation: Boolean? = null,
) {
  public class Builder {
    public var enableCustomerCancellation: Boolean? = null

    public fun build(): InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47 = InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47(
      enableCustomerCancellation = enableCustomerCancellation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47 must be a JSON object")
      return InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47(
        enableCustomerCancellation = rawObject["enable_customer_cancellation"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableCustomerCancellation?.let { put("enable_customer_cancellation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47(block: InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47.Builder.() -> Unit): InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47 = InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47.build(block)
