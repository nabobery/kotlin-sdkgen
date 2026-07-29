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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1update-branch/put/responses/202/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1update-branch/put/responses/202/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff.Serializer::class)
public class InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff(
  public val message: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var message: String? = null

    public var url: String? = null

    public fun build(): InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff = InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff(
      message = message,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff must be a JSON object")
      return InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff(block: InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff.Builder.() -> Unit): InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff = InlineReposPullsUpdateBranchPutResponse202JsonX9a31d7ff.build(block)
