package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/lock_branch
 */
@Serializable(with = InlineProtectedBranchLockBranchX8388bfb5.Serializer::class)
public class InlineProtectedBranchLockBranchX8388bfb5(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineProtectedBranchLockBranchX8388bfb5 = InlineProtectedBranchLockBranchX8388bfb5(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchLockBranchX8388bfb5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchLockBranchX8388bfb5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchLockBranchX8388bfb5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchLockBranchX8388bfb5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchLockBranchX8388bfb5 must be a JSON object")
      return InlineProtectedBranchLockBranchX8388bfb5(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchLockBranchX8388bfb5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchLockBranchX8388bfb5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchLockBranchX8388bfb5(block: InlineProtectedBranchLockBranchX8388bfb5.Builder.() -> Unit): InlineProtectedBranchLockBranchX8388bfb5 = InlineProtectedBranchLockBranchX8388bfb5.build(block)
