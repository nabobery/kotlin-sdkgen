package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import/put/requestBody/content/application~1json/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposImportPutRequestJsonXdd1ac961.Serializer::class)
public class InlineReposImportPutRequestJsonXdd1ac961(
  /**
   * The URL of the originating repository.
   */
  public val vcsUrl: String,
  /**
   * For a tfvc import, the name of the project that is being imported.
   */
  public val tfvcProject: String? = null,
  /**
   * The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type
   * before beginning the import. This detection step will be reflected in the response.
   */
  public val vcs: InlineReposImportPutRequestJsonVcsX6204abb5? = null,
  /**
   * If authentication is required, the password to provide to `vcs_url`.
   */
  public val vcsPassword: String? = null,
  /**
   * If authentication is required, the username to provide to `vcs_url`.
   */
  public val vcsUsername: String? = null,
) {
  public class Builder {
    private var vcsUrlValue: String? = null

    public var vcsUrl: String
      get() = requireNotNull(vcsUrlValue) { "vcsUrl is required" }
      set(`value`) {
        vcsUrlValue = value
      }

    /**
     * For a tfvc import, the name of the project that is being imported.
     */
    public var tfvcProject: String? = null

    /**
     * The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type
     * before beginning the import. This detection step will be reflected in the response.
     */
    public var vcs: InlineReposImportPutRequestJsonVcsX6204abb5? = null

    /**
     * If authentication is required, the password to provide to `vcs_url`.
     */
    public var vcsPassword: String? = null

    /**
     * If authentication is required, the username to provide to `vcs_url`.
     */
    public var vcsUsername: String? = null

    public fun build(): InlineReposImportPutRequestJsonXdd1ac961 {
      check(vcsUrlValue != null) { "vcsUrl is required" }
      return InlineReposImportPutRequestJsonXdd1ac961(
        vcsUrl = vcsUrl,
        tfvcProject = tfvcProject,
        vcs = vcs,
        vcsPassword = vcsPassword,
        vcsUsername = vcsUsername,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposImportPutRequestJsonXdd1ac961 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposImportPutRequestJsonXdd1ac961> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposImportPutRequestJsonXdd1ac961 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposImportPutRequestJsonXdd1ac961")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposImportPutRequestJsonXdd1ac961 must be a JSON object")
      val vcsUrl = json.decodeRequired<String>(rawObject, "vcs_url")
      return InlineReposImportPutRequestJsonXdd1ac961(
        vcsUrl = vcsUrl,
        tfvcProject = rawObject["tfvc_project"]?.let { json.decodeFromJsonElement<String>(it) },
        vcs = rawObject["vcs"]?.let { json.decodeFromJsonElement<InlineReposImportPutRequestJsonVcsX6204abb5>(it) },
        vcsPassword = rawObject["vcs_password"]?.let { json.decodeFromJsonElement<String>(it) },
        vcsUsername = rawObject["vcs_username"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposImportPutRequestJsonXdd1ac961) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposImportPutRequestJsonXdd1ac961")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("vcs_url", value.vcsUrl)
        value.tfvcProject?.let { put("tfvc_project", it) }
        value.vcs?.let { put("vcs", json.encodeToJsonElement(it)) }
        value.vcsPassword?.let { put("vcs_password", it) }
        value.vcsUsername?.let { put("vcs_username", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposImportPutRequestJsonXdd1ac961(block: InlineReposImportPutRequestJsonXdd1ac961.Builder.() -> Unit): InlineReposImportPutRequestJsonXdd1ac961 = InlineReposImportPutRequestJsonXdd1ac961.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposImportPutRequestJsonXdd1ac961 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
