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
 * efaults/put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1d
 * efaults/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6.Serializer::class)
public class InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6(
  /**
   * Specify which types of repository this security configuration should be applied to by default.
   */
  public val defaultForNewRepos:
      InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6? = null,
) {
  public class Builder {
    /**
     * Specify which types of repository this security configuration should be applied to by default.
     */
    public var defaultForNewRepos:
        InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6? = null

    public fun build(): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6 = InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6(
      defaultForNewRepos = defaultForNewRepos,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6 must be a JSON object")
      return InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6(
        defaultForNewRepos = rawObject["default_for_new_repos"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultForNewRepos?.let { put("default_for_new_repos", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6(block: InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6.Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6 = InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6.build(block)
