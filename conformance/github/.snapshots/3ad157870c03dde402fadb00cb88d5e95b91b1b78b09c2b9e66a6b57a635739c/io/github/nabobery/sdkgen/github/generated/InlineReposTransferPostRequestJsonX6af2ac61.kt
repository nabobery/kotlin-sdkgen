package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1transfer/post/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1transfer/post/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineReposTransferPostRequestJsonX6af2ac61.Serializer::class)
public class InlineReposTransferPostRequestJsonX6af2ac61(
  /**
   * The username or organization name the repository will be transferred to.
   */
  public val newOwner: String,
  /**
   * The new name to be given to the repository.
   */
  public val newName: String? = null,
  teamIds: List<Int>? = null,
) {
  /**
   * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
   */
  public val teamIds: List<Int>? = teamIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var newOwnerValue: String? = null

    public var newOwner: String
      get() = requireNotNull(newOwnerValue) { "newOwner is required" }
      set(`value`) {
        newOwnerValue = value
      }

    /**
     * The new name to be given to the repository.
     */
    public var newName: String? = null

    private var teamIdsValue: List<Int>? = null

    /**
     * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
     */
    public var teamIds: List<Int>?
      get() = teamIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        teamIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposTransferPostRequestJsonX6af2ac61 {
      check(newOwnerValue != null) { "newOwner is required" }
      return InlineReposTransferPostRequestJsonX6af2ac61(
        newOwner = newOwner,
        newName = newName,
        teamIds = teamIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposTransferPostRequestJsonX6af2ac61 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposTransferPostRequestJsonX6af2ac61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposTransferPostRequestJsonX6af2ac61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposTransferPostRequestJsonX6af2ac61")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposTransferPostRequestJsonX6af2ac61 must be a JSON object")
      val newOwner = json.decodeRequired<String>(rawObject, "new_owner")
      return InlineReposTransferPostRequestJsonX6af2ac61(
        newOwner = newOwner,
        newName = rawObject["new_name"]?.let { json.decodeFromJsonElement<String>(it) },
        teamIds = rawObject["team_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposTransferPostRequestJsonX6af2ac61) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposTransferPostRequestJsonX6af2ac61")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("new_owner", value.newOwner)
        value.newName?.let { put("new_name", it) }
        value.teamIds?.let { put("team_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposTransferPostRequestJsonX6af2ac61(block: InlineReposTransferPostRequestJsonX6af2ac61.Builder.() -> Unit): InlineReposTransferPostRequestJsonX6af2ac61 = InlineReposTransferPostRequestJsonX6af2ac61.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposTransferPostRequestJsonX6af2ac61 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
