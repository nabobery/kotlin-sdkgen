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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/allow_deletions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/allow_deletions
 */
@Serializable(with = InlineProtectedBranchAllowDeletionsXa195c4c6.Serializer::class)
public class InlineProtectedBranchAllowDeletionsXa195c4c6(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineProtectedBranchAllowDeletionsXa195c4c6 {
      check(enabledValue != null) { "enabled is required" }
      return InlineProtectedBranchAllowDeletionsXa195c4c6(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchAllowDeletionsXa195c4c6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchAllowDeletionsXa195c4c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchAllowDeletionsXa195c4c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchAllowDeletionsXa195c4c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchAllowDeletionsXa195c4c6 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineProtectedBranchAllowDeletionsXa195c4c6(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchAllowDeletionsXa195c4c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchAllowDeletionsXa195c4c6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchAllowDeletionsXa195c4c6(block: InlineProtectedBranchAllowDeletionsXa195c4c6.Builder.() -> Unit): InlineProtectedBranchAllowDeletionsXa195c4c6 = InlineProtectedBranchAllowDeletionsXa195c4c6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchAllowDeletionsXa195c4c6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
