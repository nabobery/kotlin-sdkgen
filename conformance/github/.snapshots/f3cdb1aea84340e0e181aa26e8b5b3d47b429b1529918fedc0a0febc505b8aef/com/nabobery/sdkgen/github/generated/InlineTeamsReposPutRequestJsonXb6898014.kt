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
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1repos~1{owner}~1{repo}/put/requestBody/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1repos~1{owner}~1{repo}/put/requestBody/content/application~1j
 * son/schema
 */
@Serializable(with = InlineTeamsReposPutRequestJsonXb6898014.Serializer::class)
public class InlineTeamsReposPutRequestJsonXb6898014(
  /**
   * The permission to grant the team on this repository. If no permission is specified, the team's `permission`
   * attribute will be used to determine what permission to grant the team on this repository.
   */
  public val permission: InlineTeamsReposPutRequestJsonPermissionXd00f37b6? = null,
) {
  public class Builder {
    /**
     * The permission to grant the team on this repository. If no permission is specified, the team's `permission`
     * attribute will be used to determine what permission to grant the team on this repository.
     */
    public var permission: InlineTeamsReposPutRequestJsonPermissionXd00f37b6? = null

    public fun build(): InlineTeamsReposPutRequestJsonXb6898014 = InlineTeamsReposPutRequestJsonXb6898014(
      permission = permission,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTeamsReposPutRequestJsonXb6898014 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTeamsReposPutRequestJsonXb6898014> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTeamsReposPutRequestJsonXb6898014 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTeamsReposPutRequestJsonXb6898014")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTeamsReposPutRequestJsonXb6898014 must be a JSON object")
      return InlineTeamsReposPutRequestJsonXb6898014(
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<InlineTeamsReposPutRequestJsonPermissionXd00f37b6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTeamsReposPutRequestJsonXb6898014) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTeamsReposPutRequestJsonXb6898014")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.permission?.let { put("permission", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTeamsReposPutRequestJsonXb6898014(block: InlineTeamsReposPutRequestJsonXb6898014.Builder.() -> Unit): InlineTeamsReposPutRequestJsonXb6898014 = InlineTeamsReposPutRequestJsonXb6898014.build(block)
