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
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_delegated_byp
 * ass_options/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_delegated_byp
 * ass_options/properties/reviewers/items
 */
@Serializable(with = InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da.Serializer::class)
public class InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da(
  /**
   * The ID of the team or role selected as a bypass reviewer
   */
  public val reviewerId: Int,
  /**
   * The type of the bypass reviewer
   */
  public val reviewerType:
      InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f,
  /**
   * The bypass mode for the reviewer
   */
  public val mode:
      InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89? = null,
  /**
   * The ID of the security configuration associated with this bypass reviewer
   */
  public val securityConfigurationId: Int? = null,
) {
  public class Builder {
    private var reviewerIdValue: Int? = null

    public var reviewerId: Int
      get() = requireNotNull(reviewerIdValue) { "reviewerId is required" }
      set(`value`) {
        reviewerIdValue = value
      }

    private var reviewerTypeValue:
        InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f? = null

    public var reviewerType:
        InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f
      get() = requireNotNull(reviewerTypeValue) { "reviewerType is required" }
      set(`value`) {
        reviewerTypeValue = value
      }

    /**
     * The bypass mode for the reviewer
     */
    public var mode:
        InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89? = null

    /**
     * The ID of the security configuration associated with this bypass reviewer
     */
    public var securityConfigurationId: Int? = null

    public fun build(): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da {
      check(reviewerIdValue != null) { "reviewerId is required" }
      check(reviewerTypeValue != null) { "reviewerType is required" }
      return InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        mode = mode,
        securityConfigurationId = securityConfigurationId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da must be a JSON object")
      val reviewerId = json.decodeRequired<Int>(rawObject, "reviewer_id")
      val reviewerType = json.decodeRequired<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f>(rawObject, "reviewer_type")
      return InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da(
        reviewerId = reviewerId,
        reviewerType = reviewerType,
        mode = rawObject["mode"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89>(it) },
        securityConfigurationId = rawObject["security_configuration_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reviewer_id", json.encodeToJsonElement(value.reviewerId))
        put("reviewer_type", json.encodeToJsonElement(value.reviewerType))
        value.mode?.let { put("mode", json.encodeToJsonElement(it)) }
        value.securityConfigurationId?.let { put("security_configuration_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da(block: InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da.Builder.() -> Unit): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da = InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
