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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/block_creations.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/block_creations
 */
@Serializable(with = InlineProtectedBranchBlockCreationsXc4ebf038.Serializer::class)
public class InlineProtectedBranchBlockCreationsXc4ebf038(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineProtectedBranchBlockCreationsXc4ebf038 {
      check(enabledValue != null) { "enabled is required" }
      return InlineProtectedBranchBlockCreationsXc4ebf038(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchBlockCreationsXc4ebf038 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchBlockCreationsXc4ebf038> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchBlockCreationsXc4ebf038 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchBlockCreationsXc4ebf038")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchBlockCreationsXc4ebf038 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineProtectedBranchBlockCreationsXc4ebf038(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchBlockCreationsXc4ebf038) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchBlockCreationsXc4ebf038")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchBlockCreationsXc4ebf038(block: InlineProtectedBranchBlockCreationsXc4ebf038.Builder.() -> Unit): InlineProtectedBranchBlockCreationsXc4ebf038 = InlineProtectedBranchBlockCreationsXc4ebf038.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchBlockCreationsXc4ebf038 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
