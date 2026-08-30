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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1collaborators~1{username}/put/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1collaborators~1{username}/put/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineReposCollaboratorsPutRequestJsonX391f7755.Serializer::class)
public class InlineReposCollaboratorsPutRequestJsonX391f7755(
  /**
   * The permission to grant the collaborator. **Only valid on organization-owned repositories.** We accept the
   * following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom
   * repository role name, if the owning organization has defined any.
   */
  public val permission: String? = null,
) {
  public class Builder {
    /**
     * The permission to grant the collaborator. **Only valid on organization-owned repositories.** We accept the
     * following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom
     * repository role name, if the owning organization has defined any.
     */
    public var permission: String? = null

    public fun build(): InlineReposCollaboratorsPutRequestJsonX391f7755 = InlineReposCollaboratorsPutRequestJsonX391f7755(
      permission = permission,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCollaboratorsPutRequestJsonX391f7755 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCollaboratorsPutRequestJsonX391f7755> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCollaboratorsPutRequestJsonX391f7755 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCollaboratorsPutRequestJsonX391f7755")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCollaboratorsPutRequestJsonX391f7755 must be a JSON object")
      return InlineReposCollaboratorsPutRequestJsonX391f7755(
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCollaboratorsPutRequestJsonX391f7755) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCollaboratorsPutRequestJsonX391f7755")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.permission?.let { put("permission", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCollaboratorsPutRequestJsonX391f7755(block: InlineReposCollaboratorsPutRequestJsonX391f7755.Builder.() -> Unit): InlineReposCollaboratorsPutRequestJsonX391f7755 = InlineReposCollaboratorsPutRequestJsonX391f7755.build(block)
