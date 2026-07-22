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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b.Serializer::class)
public class InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b(
  /**
   * The ID of the team or role selected as a bypass reviewer
   */
  public val reviewerId: Int,
  /**
   * The type of the bypass reviewer
   */
  public val reviewerType: InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab,
  /**
   * The bypass mode for the reviewer
   */
  public val mode: InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f? = null,
) {
  public class Builder {
    private var reviewerIdValue: Int? = null

    public var reviewerId: Int
      get() = requireNotNull(reviewerIdValue) { "reviewerId is required" }
      set(`value`) {
        reviewerIdValue = value
      }

    private var reviewerTypeValue:
        InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab? = null

    public var reviewerType: InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab
      get() = requireNotNull(reviewerTypeValue) { "reviewerType is required" }
      set(`value`) {
        reviewerTypeValue = value
      }

    /**
     * The bypass mode for the reviewer
     */
    public var mode: InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f? = null

    public fun build(): InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b {
      check(reviewerIdValue != null) { "reviewerId is required" }
      check(reviewerTypeValue != null) { "reviewerType is required" }
      return InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        mode = mode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b must be a JSON object")
      val reviewerId = json.decodeRequired<Int>(rawObject, "reviewer_id")
      val reviewerType = json.decodeRequired<InlineOrgsCodeSecurityConf078bPostRequestJsonReviewerTypeXc10bedab>(rawObject, "reviewer_type")
      return InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonModeXd85d4d4f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reviewer_id", json.encodeToJsonElement(value.reviewerId))
        put("reviewer_type", json.encodeToJsonElement(value.reviewerType))
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b(block: InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b.Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b = InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
