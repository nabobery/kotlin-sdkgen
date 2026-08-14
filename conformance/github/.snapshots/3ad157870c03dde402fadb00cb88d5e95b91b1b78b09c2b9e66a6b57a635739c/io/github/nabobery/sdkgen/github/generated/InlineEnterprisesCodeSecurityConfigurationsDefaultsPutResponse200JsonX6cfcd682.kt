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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1d
 * efaults/put/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1d
 * efaults/put/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682.Serializer::class)
public class InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682(
  public val configuration: CodeSecurityConfiguration? = null,
  /**
   * Specifies which types of repository this security configuration is applied to by default.
   */
  public val defaultForNewRepos:
      InlineEnterprisesCodeSecurd892PutResponse200JsonDefaultForNewReposX006d4bf1? = null,
) {
  public class Builder {
    public var configuration: CodeSecurityConfiguration? = null

    /**
     * Specifies which types of repository this security configuration is applied to by default.
     */
    public var defaultForNewRepos:
        InlineEnterprisesCodeSecurd892PutResponse200JsonDefaultForNewReposX006d4bf1? = null

    public fun build(): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682 = InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682(
      configuration = configuration,
      defaultForNewRepos = defaultForNewRepos,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682 must be a JSON object")
      return InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682(
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<CodeSecurityConfiguration>(it) },
        defaultForNewRepos = rawObject["default_for_new_repos"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecurd892PutResponse200JsonDefaultForNewReposX006d4bf1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.configuration?.let { put("configuration", json.encodeToJsonElement(it)) }
        value.defaultForNewRepos?.let { put("default_for_new_repos", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682(block: InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682.Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682 = InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682.build(block)
