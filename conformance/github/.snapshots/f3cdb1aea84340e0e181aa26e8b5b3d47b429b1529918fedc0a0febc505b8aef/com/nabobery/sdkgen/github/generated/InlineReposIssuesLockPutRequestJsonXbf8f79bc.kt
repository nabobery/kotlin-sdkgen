package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1lock/put/requestBody/content/ap
 * plication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1lock/put/requestBody/content/ap
 * plication~1json/schema
 */
@Serializable(with = InlineReposIssuesLockPutRequestJsonXbf8f79bc.Serializer::class)
public class InlineReposIssuesLockPutRequestJsonXbf8f79bc(
  /**
   * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these
   * reasons:
   * * `off-topic`
   * * `too heated`
   * * `resolved`
   * * `spam`
   */
  public val lockReason: InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e? = null,
) {
  public class Builder {
    /**
     * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these
     * reasons:
     * * `off-topic`
     * * `too heated`
     * * `resolved`
     * * `spam`
     */
    public var lockReason: InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e? = null

    public fun build(): InlineReposIssuesLockPutRequestJsonXbf8f79bc = InlineReposIssuesLockPutRequestJsonXbf8f79bc(
      lockReason = lockReason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesLockPutRequestJsonXbf8f79bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesLockPutRequestJsonXbf8f79bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesLockPutRequestJsonXbf8f79bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesLockPutRequestJsonXbf8f79bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesLockPutRequestJsonXbf8f79bc must be a JSON object")
      return InlineReposIssuesLockPutRequestJsonXbf8f79bc(
        lockReason = rawObject["lock_reason"]?.let { json.decodeFromJsonElement<InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLockPutRequestJsonXbf8f79bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesLockPutRequestJsonXbf8f79bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.lockReason?.let { put("lock_reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesLockPutRequestJsonXbf8f79bc(block: InlineReposIssuesLockPutRequestJsonXbf8f79bc.Builder.() -> Unit): InlineReposIssuesLockPutRequestJsonXbf8f79bc = InlineReposIssuesLockPutRequestJsonXbf8f79bc.build(block)
