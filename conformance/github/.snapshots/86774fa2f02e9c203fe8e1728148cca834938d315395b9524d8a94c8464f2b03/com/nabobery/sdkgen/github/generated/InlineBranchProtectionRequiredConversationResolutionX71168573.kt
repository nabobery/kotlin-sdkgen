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
 * sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/required_conversation_resolution.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/required_conversation_resolution
 */
@Serializable(with = InlineBranchProtectionRequiredConversationResolutionX71168573.Serializer::class)
public class InlineBranchProtectionRequiredConversationResolutionX71168573(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionRequiredConversationResolutionX71168573 = InlineBranchProtectionRequiredConversationResolutionX71168573(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionRequiredConversationResolutionX71168573 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionRequiredConversationResolutionX71168573> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionRequiredConversationResolutionX71168573 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionRequiredConversationResolutionX71168573")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionRequiredConversationResolutionX71168573 must be a JSON object")
      return InlineBranchProtectionRequiredConversationResolutionX71168573(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionRequiredConversationResolutionX71168573) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionRequiredConversationResolutionX71168573")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionRequiredConversationResolutionX71168573(block: InlineBranchProtectionRequiredConversationResolutionX71168573.Builder.() -> Unit): InlineBranchProtectionRequiredConversationResolutionX71168573 = InlineBranchProtectionRequiredConversationResolutionX71168573.build(block)
