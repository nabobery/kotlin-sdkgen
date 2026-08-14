package io.github.nabobery.sdkgen.github.generated

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
 * sponses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1defaults/put/re
 * sponses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac.Serializer::class)
public class InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac(
  public val configuration: CodeSecurityConfiguration? = null,
  /**
   * Specifies which types of repository this security configuration is applied to by default.
   */
  public val defaultForNewRepos:
      InlineOrgsCodeSecurityConf2752PutResponse200JsonDefaultForNewReposX72c965cb? = null,
) {
  public class Builder {
    public var configuration: CodeSecurityConfiguration? = null

    /**
     * Specifies which types of repository this security configuration is applied to by default.
     */
    public var defaultForNewRepos:
        InlineOrgsCodeSecurityConf2752PutResponse200JsonDefaultForNewReposX72c965cb? = null

    public fun build(): InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac = InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac(
      configuration = configuration,
      defaultForNewRepos = defaultForNewRepos,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac must be a JSON object")
      return InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac(
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<CodeSecurityConfiguration>(it) },
        defaultForNewRepos = rawObject["default_for_new_repos"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf2752PutResponse200JsonDefaultForNewReposX72c965cb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.configuration?.let { put("configuration", json.encodeToJsonElement(it)) }
        value.defaultForNewRepos?.let { put("default_for_new_repos", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac(block: InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac.Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac = InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac.build(block)
