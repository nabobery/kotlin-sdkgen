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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases/put/requestBody/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1immutable-releases/put/requestBody/content/application~1
 * json/schema
 */
@Serializable(with = InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52.Serializer::class)
public class InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52(
  /**
   * The policy that controls how immutable releases are enforced in the organization.
   */
  public val enforcedRepositories:
      InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026,
  selectedRepositoryIds: List<Int>? = null,
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
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var enforcedRepositoriesValue:
        InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026? = null

    public var enforcedRepositories:
        InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026
      get() = requireNotNull(enforcedRepositoriesValue) { "enforcedRepositories is required" }
      set(`value`) {
        enforcedRepositoriesValue = value
      }

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository ids for which immutable releases enforcement should be applied. You can only provide a
     * list of repository ids when the `enforced_repositories` is set to `selected`. You can add and remove individual
     * repositories using the [Enable a selected repository for immutable releases in an
     * organization](https://docs.github.com/rest/orgs/orgs#enable-a-selected-repository-for-immutable-releases-in-an-or
     * ganization) and [Disable a selected repository for immutable releases in an
     * organization](https://docs.github.com/rest/orgs/orgs#disable-a-selected-repository-for-immutable-releases-in-an-o
     * rganization) endpoints.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52 {
      check(enforcedRepositoriesValue != null) { "enforcedRepositories is required" }
      return InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52(
        enforcedRepositories = enforcedRepositories,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52 must be a JSON object")
      val enforcedRepositories = json.decodeRequired<InlineOrgsSettingsImmutableReleasesPutRequestJsonEnforcedRepositoriesX7937c026>(rawObject, "enforced_repositories")
      return InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52(
        enforcedRepositories = enforcedRepositories,
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enforced_repositories", json.encodeToJsonElement(value.enforcedRepositories))
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52(block: InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52.Builder.() -> Unit): InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52 = InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSettingsImmutableReleasesPutRequestJsonX10f35f52 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
