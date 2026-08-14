package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/trial_settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/trial_settings
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941(
  public val endBehavior: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2,
) {
  public class Builder {
    private var endBehaviorValue:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2? = null

    public var endBehavior: InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941 {
      check(endBehaviorValue != null) { "endBehavior is required" }
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941(
        endBehavior = endBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941 must be a JSON object")
      val endBehavior = json.decodeRequired<InlineV1PaymentLinksPostRequestFormSubscriptionDataEndBehaviorX33b230a2>(rawObject, "end_behavior")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941(
        endBehavior = endBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941 = InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
