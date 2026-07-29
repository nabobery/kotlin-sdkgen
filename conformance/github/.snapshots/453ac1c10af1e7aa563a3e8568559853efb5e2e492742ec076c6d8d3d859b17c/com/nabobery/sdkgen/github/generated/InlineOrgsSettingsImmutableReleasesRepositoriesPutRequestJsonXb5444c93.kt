package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases~1repositories/put/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases~1repositories/put/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93.Serializer::class)
public class InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93(
  selectedRepositoryIds: List<Int>,
) {
  /**
   * An array of repository ids for which immutable releases enforcement should be applied. You can only provide a list
   * of repository ids when the `enforced_repositories` is set to `selected`. You can add and remove individual
   * repositories using the [Enable a selected repository for immutable releases in an
   * organization](https://docs.github.com/rest/orgs/orgs#enable-a-selected-repository-for-immutable-releases-in-an-orga
   * nization) and [Disable a selected repository for immutable releases in an
   * organization](https://docs.github.com/rest/orgs/orgs#disable-a-selected-repository-for-immutable-releases-in-an-org
   * anization) endpoints.
   */
  public val selectedRepositoryIds: List<Int> = selectedRepositoryIds.toList()

  public class Builder {
    private var selectedRepositoryIdsValue: List<Int>? = null

    public var selectedRepositoryIds: List<Int>
      get() = requireNotNull(selectedRepositoryIdsValue) { "selectedRepositoryIds is required" }.toList()
      set(`value`) {
        selectedRepositoryIdsValue = value.toList()
      }

    public fun build(): InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93 {
      check(selectedRepositoryIdsValue != null) { "selectedRepositoryIds is required" }
      return InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93 must be a JSON object")
      val selectedRepositoryIds = json.decodeRequired<List<Int>>(rawObject, "selected_repository_ids")
      return InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93(
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_repository_ids", json.encodeToJsonElement(value.selectedRepositoryIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93(block: InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93.Builder.() -> Unit): InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93 = InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSettingsImmutableReleasesRepositoriesPutRequestJsonXb5444c93 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
