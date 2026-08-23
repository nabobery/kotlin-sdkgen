package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/offline/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/offline/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03(block: InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 = InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf1X7380da03 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
