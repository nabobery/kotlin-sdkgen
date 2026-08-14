package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1organizations~1add/post/re
 * questBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1organizations~1add/post/re
 * questBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4.Serializer::class)
public class InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4(
  organizationSlugs: List<String>,
) {
  /**
   * Organization slug to assign the team to.
   */
  public val organizationSlugs: List<String> = organizationSlugs.toList()

  public class Builder {
    private var organizationSlugsValue: List<String>? = null

    public var organizationSlugs: List<String>
      get() = requireNotNull(organizationSlugsValue) { "organizationSlugs is required" }.toList()
      set(`value`) {
        organizationSlugsValue = value.toList()
      }

    public fun build(): InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4 {
      check(organizationSlugsValue != null) { "organizationSlugs is required" }
      return InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4(
        organizationSlugs = organizationSlugs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4 must be a JSON object")
      val organizationSlugs = json.decodeRequired<List<String>>(rawObject, "organization_slugs")
      return InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4(
        organizationSlugs = organizationSlugs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("organization_slugs", json.encodeToJsonElement(value.organizationSlugs))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4(block: InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4.Builder.() -> Unit): InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4 = InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesTeamsOrganizationsAddPostRequestJsonX2c1125e4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
