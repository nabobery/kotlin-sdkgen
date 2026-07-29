package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_setup_intent/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_setup_intent/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04.Serializer::class)
public class InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04(
  /**
   * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
   * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
   * payment method in a checkout flow.
   */
  public val allowRedisplay:
      InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8,
  /**
   * The ID of the SetupIntent to process on the reader.
   */
  public val setupIntent: String,
  expand: List<String>? = null,
  /**
   * Configuration overrides for this setup, such as MOTO and customer cancellation settings.
   */
  public val processConfig:
      InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowRedisplayValue:
        InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8? = null

    public var allowRedisplay:
        InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8
      get() = requireNotNull(allowRedisplayValue) { "allowRedisplay is required" }
      set(`value`) {
        allowRedisplayValue = value
      }

    private var setupIntentValue: String? = null

    public var setupIntent: String
      get() = requireNotNull(setupIntentValue) { "setupIntent is required" }
      set(`value`) {
        setupIntentValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Configuration overrides for this setup, such as MOTO and customer cancellation settings.
     */
    public var processConfig:
        InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47? = null

    public fun build(): InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 {
      check(allowRedisplayValue != null) { "allowRedisplay is required" }
      check(setupIntentValue != null) { "setupIntent is required" }
      return InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04(
        allowRedisplay = allowRedisplay,
        setupIntent = setupIntent,
        expand = expand,
        processConfig = processConfig,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 must be a JSON object")
      val allowRedisplay = json.decodeRequired<InlineV1TerminalReadersProcessSetupIntentPostRequestFormAllowRedisplayX037c7bf8>(rawObject, "allow_redisplay")
      val setupIntent = json.decodeRequired<String>(rawObject, "setup_intent")
      return InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04(
        allowRedisplay = allowRedisplay,
        setupIntent = setupIntent,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        processConfig = rawObject["process_config"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersProcessSetupIntentPostRequestFormProcessConfigXfd1aeb47>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("allow_redisplay", json.encodeToJsonElement(value.allowRedisplay))
        put("setup_intent", value.setupIntent)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.processConfig?.let { put("process_config", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04(block: InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04.Builder.() -> Unit): InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 = InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
