package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
 * Feature options for secret scanning delegated bypass
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_delegated_bypass_options
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f.Serializer::class)
public class InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f(
  /**
   * The bypass reviewers for secret scanning delegated bypass
   */
  public val reviewers: List<InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b>? = null,
) {
  public class Builder {
    /**
     * The bypass reviewers for secret scanning delegated bypass
     */
    public var reviewers: List<InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b>? = null

    public fun build(): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f = InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f(
      reviewers = reviewers,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f must be a JSON object")
      return InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f(
        reviewers = rawObject["reviewers"]?.let { json.decodeFromJsonElement<List<InlineOrgsCodeSecurityConf078bPostRequestJsonItemX6fce6a4b>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewers?.let { put("reviewers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f(block: InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f.Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f = InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f.build(block)
