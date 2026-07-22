package com.nabobery.sdkgen.github.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1repos~1{owner}~1{repo}/put/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1repos~1{owner}~1{repo}/put/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineOrgsTeamsReposPutRequestJsonX41d9868d.Serializer::class)
public class InlineOrgsTeamsReposPutRequestJsonX41d9868d(
  /**
   * The permission to grant the team on this repository. We accept the following permissions to be set: `pull`,
   * `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning
   * organization has defined any. If no permission is specified, the team's `permission` attribute will be used to
   * determine what permission to grant the team on this repository.
   */
  public val permission: String? = null,
) {
  public class Builder {
    /**
     * The permission to grant the team on this repository. We accept the following permissions to be set: `pull`,
     * `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning
     * organization has defined any. If no permission is specified, the team's `permission` attribute will be used to
     * determine what permission to grant the team on this repository.
     */
    public var permission: String? = null

    public fun build(): InlineOrgsTeamsReposPutRequestJsonX41d9868d = InlineOrgsTeamsReposPutRequestJsonX41d9868d(
      permission = permission,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsTeamsReposPutRequestJsonX41d9868d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsTeamsReposPutRequestJsonX41d9868d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsReposPutRequestJsonX41d9868d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsTeamsReposPutRequestJsonX41d9868d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsTeamsReposPutRequestJsonX41d9868d must be a JSON object")
      return InlineOrgsTeamsReposPutRequestJsonX41d9868d(
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsReposPutRequestJsonX41d9868d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsTeamsReposPutRequestJsonX41d9868d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.permission?.let { put("permission", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsTeamsReposPutRequestJsonX41d9868d(block: InlineOrgsTeamsReposPutRequestJsonX41d9868d.Builder.() -> Unit): InlineOrgsTeamsReposPutRequestJsonX41d9868d = InlineOrgsTeamsReposPutRequestJsonX41d9868d.build(block)
