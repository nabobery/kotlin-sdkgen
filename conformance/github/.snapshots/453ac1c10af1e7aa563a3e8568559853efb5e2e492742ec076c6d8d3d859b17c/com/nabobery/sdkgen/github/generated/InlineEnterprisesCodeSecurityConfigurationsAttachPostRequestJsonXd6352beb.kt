package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1a
 * ttach/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1a
 * ttach/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb.Serializer::class)
public class InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb(
  /**
   * The type of repositories to attach the configuration to.
   */
  public val scope: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef,
) {
  public class Builder {
    private var scopeValue:
        InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef? = null

    public var scope: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    public fun build(): InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb {
      check(scopeValue != null) { "scope is required" }
      return InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb(
        scope = scope,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb must be a JSON object")
      val scope = json.decodeRequired<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonScopeX61d165ef>(rawObject, "scope")
      return InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb(
        scope = scope,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("scope", json.encodeToJsonElement(value.scope))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb(block: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb.Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb = InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
