package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/1/properties/re
 * actions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/1/properties/re
 * actions
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4.Serializer::class)
public class InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4(
  public val _1: Int? = null,
  public val _12: Int? = null,
  public val confused: Int? = null,
  public val eyes: Int? = null,
  public val heart: Int? = null,
  public val hooray: Int? = null,
  public val laugh: Int? = null,
  public val rocket: Int? = null,
  public val totalCount: Int? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var _1: Int? = null

    public var _12: Int? = null

    public var confused: Int? = null

    public var eyes: Int? = null

    public var heart: Int? = null

    public var hooray: Int? = null

    public var laugh: Int? = null

    public var rocket: Int? = null

    public var totalCount: Int? = null

    public var url: String? = null

    public fun build(): InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4 = InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4(
      _1 = _1,
      _12 = _12,
      confused = confused,
      eyes = eyes,
      heart = heart,
      hooray = hooray,
      laugh = laugh,
      rocket = rocket,
      totalCount = totalCount,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4 must be a JSON object")
      return InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4(
        _1 = rawObject["+1"]?.let { json.decodeFromJsonElement<Int>(it) },
        _12 = rawObject["-1"]?.let { json.decodeFromJsonElement<Int>(it) },
        confused = rawObject["confused"]?.let { json.decodeFromJsonElement<Int>(it) },
        eyes = rawObject["eyes"]?.let { json.decodeFromJsonElement<Int>(it) },
        heart = rawObject["heart"]?.let { json.decodeFromJsonElement<Int>(it) },
        hooray = rawObject["hooray"]?.let { json.decodeFromJsonElement<Int>(it) },
        laugh = rawObject["laugh"]?.let { json.decodeFromJsonElement<Int>(it) },
        rocket = rawObject["rocket"]?.let { json.decodeFromJsonElement<Int>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value._1?.let { put("+1", json.encodeToJsonElement(it)) }
        value._12?.let { put("-1", json.encodeToJsonElement(it)) }
        value.confused?.let { put("confused", json.encodeToJsonElement(it)) }
        value.eyes?.let { put("eyes", json.encodeToJsonElement(it)) }
        value.heart?.let { put("heart", json.encodeToJsonElement(it)) }
        value.hooray?.let { put("hooray", json.encodeToJsonElement(it)) }
        value.laugh?.let { put("laugh", json.encodeToJsonElement(it)) }
        value.rocket?.let { put("rocket", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4(block: InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4.Builder.() -> Unit): InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4 = InlineWebhookIssueCommentDeletedIssueAllOf2ReactionsX7a5cdea4.build(block)
