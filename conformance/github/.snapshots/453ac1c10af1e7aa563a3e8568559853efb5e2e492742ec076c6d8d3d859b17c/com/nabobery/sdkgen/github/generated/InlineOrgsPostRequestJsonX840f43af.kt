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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1{security_product}~1{enablement}/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1{security_product}~1{enablement}/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsPostRequestJsonX840f43af.Serializer::class)
public class InlineOrgsPostRequestJsonX840f43af(
  /**
   * CodeQL query suite to be used. If you specify the `query_suite` parameter, the default setup will be configured
   * with this query suite only on all repositories that didn't have default setup already configured. It will not
   * change the query suite on repositories that already have default setup configured.
   * If you don't specify any `query_suite` in your request, the preferred query suite of the organization will be
   * applied.
   */
  public val querySuite: InlineOrgsPostRequestJsonQuerySuiteXbb507ac3? = null,
) {
  public class Builder {
    /**
     * CodeQL query suite to be used. If you specify the `query_suite` parameter, the default setup will be configured
     * with this query suite only on all repositories that didn't have default setup already configured. It will not
     * change the query suite on repositories that already have default setup configured.
     * If you don't specify any `query_suite` in your request, the preferred query suite of the organization will be
     * applied.
     */
    public var querySuite: InlineOrgsPostRequestJsonQuerySuiteXbb507ac3? = null

    public fun build(): InlineOrgsPostRequestJsonX840f43af = InlineOrgsPostRequestJsonX840f43af(
      querySuite = querySuite,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPostRequestJsonX840f43af = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsPostRequestJsonX840f43af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPostRequestJsonX840f43af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPostRequestJsonX840f43af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPostRequestJsonX840f43af must be a JSON object")
      return InlineOrgsPostRequestJsonX840f43af(
        querySuite = rawObject["query_suite"]?.let { json.decodeFromJsonElement<InlineOrgsPostRequestJsonQuerySuiteXbb507ac3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPostRequestJsonX840f43af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPostRequestJsonX840f43af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.querySuite?.let { put("query_suite", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPostRequestJsonX840f43af(block: InlineOrgsPostRequestJsonX840f43af.Builder.() -> Unit): InlineOrgsPostRequestJsonX840f43af = InlineOrgsPostRequestJsonX840f43af.build(block)
