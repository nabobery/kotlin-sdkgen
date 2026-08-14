package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/allow_force_pushes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/allow_force_pushes
 */
@Serializable(with = InlineProtectedBranchAllowForcePushesXd32d1771.Serializer::class)
public class InlineProtectedBranchAllowForcePushesXd32d1771(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineProtectedBranchAllowForcePushesXd32d1771 {
      check(enabledValue != null) { "enabled is required" }
      return InlineProtectedBranchAllowForcePushesXd32d1771(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchAllowForcePushesXd32d1771 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchAllowForcePushesXd32d1771> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchAllowForcePushesXd32d1771 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchAllowForcePushesXd32d1771")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchAllowForcePushesXd32d1771 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineProtectedBranchAllowForcePushesXd32d1771(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchAllowForcePushesXd32d1771) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchAllowForcePushesXd32d1771")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchAllowForcePushesXd32d1771(block: InlineProtectedBranchAllowForcePushesXd32d1771.Builder.() -> Unit): InlineProtectedBranchAllowForcePushesXd32d1771 = InlineProtectedBranchAllowForcePushesXd32d1771.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchAllowForcePushesXd32d1771 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
