package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Check Dependabot security updates
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-automated-security-fixes
 */
@Serializable(with = CheckAutomatedSecurityFixes.Serializer::class)
public class CheckAutomatedSecurityFixes(
  /**
   * Whether Dependabot security updates are enabled for the repository.
   */
  public val enabled: Boolean,
  /**
   * Whether Dependabot security updates are paused for the repository.
   */
  public val paused: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var pausedValue: Boolean? = null

    public var paused: Boolean
      get() = requireNotNull(pausedValue) { "paused is required" }
      set(`value`) {
        pausedValue = value
      }

    public fun build(): CheckAutomatedSecurityFixes {
      check(enabledValue != null) { "enabled is required" }
      check(pausedValue != null) { "paused is required" }
      return CheckAutomatedSecurityFixes(
        enabled = enabled,
        paused = paused,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckAutomatedSecurityFixes = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckAutomatedSecurityFixes> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckAutomatedSecurityFixes {
      val jsonDecoder = decoder.requireJsonDecoder("CheckAutomatedSecurityFixes")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckAutomatedSecurityFixes must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val paused = json.decodeRequired<Boolean>(rawObject, "paused")
      return CheckAutomatedSecurityFixes(
        enabled = enabled,
        paused = paused,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckAutomatedSecurityFixes) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckAutomatedSecurityFixes")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("paused", json.encodeToJsonElement(value.paused))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkAutomatedSecurityFixes(block: CheckAutomatedSecurityFixes.Builder.() -> Unit): CheckAutomatedSecurityFixes = CheckAutomatedSecurityFixes.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckAutomatedSecurityFixes is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
