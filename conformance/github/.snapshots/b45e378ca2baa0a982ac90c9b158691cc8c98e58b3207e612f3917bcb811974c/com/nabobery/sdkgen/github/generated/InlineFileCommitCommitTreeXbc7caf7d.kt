package com.nabobery.sdkgen.github.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/tree.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/tree
 */
@Serializable(with = InlineFileCommitCommitTreeXbc7caf7d.Serializer::class)
public class InlineFileCommitCommitTreeXbc7caf7d(
  public val sha: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var sha: String? = null

    public var url: String? = null

    public fun build(): InlineFileCommitCommitTreeXbc7caf7d = InlineFileCommitCommitTreeXbc7caf7d(
      sha = sha,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitCommitTreeXbc7caf7d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileCommitCommitTreeXbc7caf7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitCommitTreeXbc7caf7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitCommitTreeXbc7caf7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitCommitTreeXbc7caf7d must be a JSON object")
      return InlineFileCommitCommitTreeXbc7caf7d(
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitCommitTreeXbc7caf7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitCommitTreeXbc7caf7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sha?.let { put("sha", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileCommitCommitTreeXbc7caf7d(block: InlineFileCommitCommitTreeXbc7caf7d.Builder.() -> Unit): InlineFileCommitCommitTreeXbc7caf7d = InlineFileCommitCommitTreeXbc7caf7d.build(block)
