package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-limits.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-limits
 */
@Serializable(with = ActionsHostedRunnerLimits.Serializer::class)
public class ActionsHostedRunnerLimits(
  /**
   * Provides details of static public IP limits for GitHub-hosted Hosted Runners
   */
  public val publicIps: InlineActionsHostedRunnerLimitsPublicIpsX857a1467,
) {
  public class Builder {
    private var publicIpsValue: InlineActionsHostedRunnerLimitsPublicIpsX857a1467? = null

    public var publicIps: InlineActionsHostedRunnerLimitsPublicIpsX857a1467
      get() = requireNotNull(publicIpsValue) { "publicIps is required" }
      set(`value`) {
        publicIpsValue = value
      }

    public fun build(): ActionsHostedRunnerLimits {
      check(publicIpsValue != null) { "publicIps is required" }
      return ActionsHostedRunnerLimits(
        publicIps = publicIps,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsHostedRunnerLimits = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsHostedRunnerLimits> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsHostedRunnerLimits {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsHostedRunnerLimits")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsHostedRunnerLimits must be a JSON object")
      val publicIps = json.decodeRequired<InlineActionsHostedRunnerLimitsPublicIpsX857a1467>(rawObject, "public_ips")
      return ActionsHostedRunnerLimits(
        publicIps = publicIps,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsHostedRunnerLimits) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsHostedRunnerLimits")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("public_ips", json.encodeToJsonElement(value.publicIps))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsHostedRunnerLimits(block: ActionsHostedRunnerLimits.Builder.() -> Unit): ActionsHostedRunnerLimits = ActionsHostedRunnerLimits.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsHostedRunnerLimits is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
