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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1update-branch/put/requestBody/con
 * tent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1update-branch/put/requestBody/con
 * tent/application~1json/schema
 */
@Serializable(with = InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df.Serializer::class)
public class InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df(
  /**
   * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If
   * the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You
   * can use the "[List commits](https://docs.github.com/rest/commits/commits#list-commits)" endpoint to find the most
   * recent commit SHA. Default: SHA of the pull request's current HEAD ref.
   */
  public val expectedHeadSha: String? = null,
) {
  public class Builder {
    /**
     * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If
     * the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status.
     * You can use the "[List commits](https://docs.github.com/rest/commits/commits#list-commits)" endpoint to find the
     * most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
     */
    public var expectedHeadSha: String? = null

    public fun build(): InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df = InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df(
      expectedHeadSha = expectedHeadSha,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df must be a JSON object")
      return InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df(
        expectedHeadSha = rawObject["expected_head_sha"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expectedHeadSha?.let { put("expected_head_sha", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df(block: InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df.Builder.() -> Unit): InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df = InlineReposPullsUpdateBranchPutRequestJsonXdc8ff5df.build(block)
