package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_conversation_resolution.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_conversation_resolution
 */
@Serializable(with = InlineProtectedBranchRequiredConversationResolutionXb679ea1a.Serializer::class)
public class InlineProtectedBranchRequiredConversationResolutionXb679ea1a(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineProtectedBranchRequiredConversationResolutionXb679ea1a = InlineProtectedBranchRequiredConversationResolutionXb679ea1a(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredConversationResolutionXb679ea1a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchRequiredConversationResolutionXb679ea1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredConversationResolutionXb679ea1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredConversationResolutionXb679ea1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredConversationResolutionXb679ea1a must be a JSON object")
      return InlineProtectedBranchRequiredConversationResolutionXb679ea1a(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredConversationResolutionXb679ea1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredConversationResolutionXb679ea1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchRequiredConversationResolutionXb679ea1a(block: InlineProtectedBranchRequiredConversationResolutionXb679ea1a.Builder.() -> Unit): InlineProtectedBranchRequiredConversationResolutionXb679ea1a = InlineProtectedBranchRequiredConversationResolutionXb679ea1a.build(block)
