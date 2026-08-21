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
 * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/lock_branch
 */
@Serializable(with = InlineBranchProtectionLockBranchX20503c45.Serializer::class)
public class InlineBranchProtectionLockBranchX20503c45(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionLockBranchX20503c45 = InlineBranchProtectionLockBranchX20503c45(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionLockBranchX20503c45 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchProtectionLockBranchX20503c45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionLockBranchX20503c45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionLockBranchX20503c45")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionLockBranchX20503c45 must be a JSON object")
      return InlineBranchProtectionLockBranchX20503c45(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionLockBranchX20503c45) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionLockBranchX20503c45")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionLockBranchX20503c45(block: InlineBranchProtectionLockBranchX20503c45.Builder.() -> Unit): InlineBranchProtectionLockBranchX20503c45 = InlineBranchProtectionLockBranchX20503c45.build(block)
