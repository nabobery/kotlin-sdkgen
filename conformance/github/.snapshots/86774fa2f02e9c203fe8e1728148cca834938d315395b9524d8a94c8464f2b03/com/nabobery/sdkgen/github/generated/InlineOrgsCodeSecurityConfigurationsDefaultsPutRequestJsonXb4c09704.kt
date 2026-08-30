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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1defaults/put/re
 * questBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1defaults/put/re
 * questBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704.Serializer::class)
public class InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704(
  /**
   * Specify which types of repository this security configuration should be applied to by default.
   */
  public val defaultForNewRepos:
      InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d? = null,
) {
  public class Builder {
    /**
     * Specify which types of repository this security configuration should be applied to by default.
     */
    public var defaultForNewRepos:
        InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d? = null

    public fun build(): InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704 = InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704(
      defaultForNewRepos = defaultForNewRepos,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704 must be a JSON object")
      return InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704(
        defaultForNewRepos = rawObject["default_for_new_repos"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultForNewRepos?.let { put("default_for_new_repos", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704(block: InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704.Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704 = InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704.build(block)
