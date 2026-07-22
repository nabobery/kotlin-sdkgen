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
 * Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to
 * `false` to prevent fork syncing.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-protection/properties/allow_fork_syncing
 */
@Serializable(with = InlineBranchProtectionAllowForkSyncingX9719e291.Serializer::class)
public class InlineBranchProtectionAllowForkSyncingX9719e291(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineBranchProtectionAllowForkSyncingX9719e291 = InlineBranchProtectionAllowForkSyncingX9719e291(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchProtectionAllowForkSyncingX9719e291 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBranchProtectionAllowForkSyncingX9719e291> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchProtectionAllowForkSyncingX9719e291 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchProtectionAllowForkSyncingX9719e291")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchProtectionAllowForkSyncingX9719e291 must be a JSON object")
      return InlineBranchProtectionAllowForkSyncingX9719e291(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchProtectionAllowForkSyncingX9719e291) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchProtectionAllowForkSyncingX9719e291")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchProtectionAllowForkSyncingX9719e291(block: InlineBranchProtectionAllowForkSyncingX9719e291.Builder.() -> Unit): InlineBranchProtectionAllowForkSyncingX9719e291 = InlineBranchProtectionAllowForkSyncingX9719e291.build(block)
