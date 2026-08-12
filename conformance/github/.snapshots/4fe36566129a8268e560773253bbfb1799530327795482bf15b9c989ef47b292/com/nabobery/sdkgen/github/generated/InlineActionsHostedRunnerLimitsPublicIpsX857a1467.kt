package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Provides details of static public IP limits for GitHub-hosted Hosted Runners
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-limits/properties/public_ips
 */
@Serializable(with = InlineActionsHostedRunnerLimitsPublicIpsX857a1467.Serializer::class)
public class InlineActionsHostedRunnerLimitsPublicIpsX857a1467(
  /**
   * The current number of static public IP addresses in use by Hosted Runners.
   */
  public val currentUsage: Int,
  /**
   * The maximum number of static public IP addresses that can be used for Hosted Runners.
   */
  public val maximum: Int,
) {
  public class Builder {
    private var currentUsageValue: Int? = null

    public var currentUsage: Int
      get() = requireNotNull(currentUsageValue) { "currentUsage is required" }
      set(`value`) {
        currentUsageValue = value
      }

    private var maximumValue: Int? = null

    public var maximum: Int
      get() = requireNotNull(maximumValue) { "maximum is required" }
      set(`value`) {
        maximumValue = value
      }

    public fun build(): InlineActionsHostedRunnerLimitsPublicIpsX857a1467 {
      check(currentUsageValue != null) { "currentUsage is required" }
      check(maximumValue != null) { "maximum is required" }
      return InlineActionsHostedRunnerLimitsPublicIpsX857a1467(
        currentUsage = currentUsage,
        maximum = maximum,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineActionsHostedRunnerLimitsPublicIpsX857a1467 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineActionsHostedRunnerLimitsPublicIpsX857a1467> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineActionsHostedRunnerLimitsPublicIpsX857a1467 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineActionsHostedRunnerLimitsPublicIpsX857a1467")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineActionsHostedRunnerLimitsPublicIpsX857a1467 must be a JSON object")
      val currentUsage = json.decodeRequired<Int>(rawObject, "current_usage")
      val maximum = json.decodeRequired<Int>(rawObject, "maximum")
      return InlineActionsHostedRunnerLimitsPublicIpsX857a1467(
        currentUsage = currentUsage,
        maximum = maximum,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineActionsHostedRunnerLimitsPublicIpsX857a1467) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineActionsHostedRunnerLimitsPublicIpsX857a1467")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("current_usage", json.encodeToJsonElement(value.currentUsage))
        put("maximum", json.encodeToJsonElement(value.maximum))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineActionsHostedRunnerLimitsPublicIpsX857a1467(block: InlineActionsHostedRunnerLimitsPublicIpsX857a1467.Builder.() -> Unit): InlineActionsHostedRunnerLimitsPublicIpsX857a1467 = InlineActionsHostedRunnerLimitsPublicIpsX857a1467.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineActionsHostedRunnerLimitsPublicIpsX857a1467 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
