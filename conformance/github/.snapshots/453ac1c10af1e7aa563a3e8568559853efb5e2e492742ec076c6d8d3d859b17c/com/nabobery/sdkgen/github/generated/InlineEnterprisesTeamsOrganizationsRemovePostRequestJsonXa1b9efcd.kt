package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1organizations~1remove/post
 * /requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1organizations~1remove/post
 * /requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd.Serializer::class)
public class InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd(
  organizationSlugs: List<String>,
) {
  /**
   * Organization slug to unassign the team from.
   */
  public val organizationSlugs: List<String> = organizationSlugs.toList()

  public class Builder {
    private var organizationSlugsValue: List<String>? = null

    public var organizationSlugs: List<String>
      get() = requireNotNull(organizationSlugsValue) { "organizationSlugs is required" }.toList()
      set(`value`) {
        organizationSlugsValue = value.toList()
      }

    public fun build(): InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd {
      check(organizationSlugsValue != null) { "organizationSlugs is required" }
      return InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd(
        organizationSlugs = organizationSlugs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd must be a JSON object")
      val organizationSlugs = json.decodeRequired<List<String>>(rawObject, "organization_slugs")
      return InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd(
        organizationSlugs = organizationSlugs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("organization_slugs", json.encodeToJsonElement(value.organizationSlugs))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd(block: InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd.Builder.() -> Unit): InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd = InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesTeamsOrganizationsRemovePostRequestJsonXa1b9efcd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
