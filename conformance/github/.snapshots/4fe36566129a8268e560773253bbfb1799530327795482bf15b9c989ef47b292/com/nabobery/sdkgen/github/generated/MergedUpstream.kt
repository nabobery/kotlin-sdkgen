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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Results of a successful merge upstream request
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/merged-upstream
 */
@Serializable(with = MergedUpstream.Serializer::class)
public class MergedUpstream(
  public val baseBranch: String? = null,
  public val mergeType: InlineMergedUpstreamMergeTypeX7755f7bc? = null,
  public val message: String? = null,
) {
  public class Builder {
    public var baseBranch: String? = null

    public var mergeType: InlineMergedUpstreamMergeTypeX7755f7bc? = null

    public var message: String? = null

    public fun build(): MergedUpstream = MergedUpstream(
      baseBranch = baseBranch,
      mergeType = mergeType,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MergedUpstream = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MergedUpstream> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MergedUpstream {
      val jsonDecoder = decoder.requireJsonDecoder("MergedUpstream")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MergedUpstream must be a JSON object")
      return MergedUpstream(
        baseBranch = rawObject["base_branch"]?.let { json.decodeFromJsonElement<String>(it) },
        mergeType = rawObject["merge_type"]?.let { json.decodeFromJsonElement<InlineMergedUpstreamMergeTypeX7755f7bc>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MergedUpstream) {
      val jsonEncoder = encoder.requireJsonEncoder("MergedUpstream")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.baseBranch?.let { put("base_branch", it) }
        value.mergeType?.let { put("merge_type", json.encodeToJsonElement(it)) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mergedUpstream(block: MergedUpstream.Builder.() -> Unit): MergedUpstream = MergedUpstream.build(block)
