package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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

@Serializable
public data class SubscriptionsTrialsResourceTrialSettingsView(
  @SerialName("end_behavior")
  public val endBehavior: SubscriptionsTrialsResourceEndBehavior,
)

/**
 * Configures how this subscription behaves during the trial period.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_trials_resource_trial_settings
 */
@Serializable(with = SubscriptionsTrialsResourceTrialSettings.Serializer::class)
public class SubscriptionsTrialsResourceTrialSettings(
  public val endBehavior: SubscriptionsTrialsResourceEndBehavior,
) {
  public class Builder {
    private var endBehaviorValue: SubscriptionsTrialsResourceEndBehavior? = null

    public var endBehavior: SubscriptionsTrialsResourceEndBehavior
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    public fun build(): SubscriptionsTrialsResourceTrialSettings {
      check(endBehaviorValue != null) { "endBehavior is required" }
      return SubscriptionsTrialsResourceTrialSettings(
        endBehavior = endBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsTrialsResourceTrialSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsTrialsResourceTrialSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsTrialsResourceTrialSettings {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsTrialsResourceTrialSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsTrialsResourceTrialSettings must be a JSON object")
      val endBehavior = json.decodeRequired<SubscriptionsTrialsResourceEndBehavior>(rawObject, "end_behavior")
      return SubscriptionsTrialsResourceTrialSettings(
        endBehavior = endBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsTrialsResourceTrialSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsTrialsResourceTrialSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsTrialsResourceTrialSettings(block: SubscriptionsTrialsResourceTrialSettings.Builder.() -> Unit): SubscriptionsTrialsResourceTrialSettings = SubscriptionsTrialsResourceTrialSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsTrialsResourceTrialSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
