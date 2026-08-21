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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1generate-notes/post/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1releases~1generate-notes/post/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc.Serializer::class)
public class InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc(
  /**
   * The tag name for the release. This can be an existing tag or a new one.
   */
  public val tagName: String,
  /**
   * Specifies a path to a file in the repository containing configuration settings used for generating the release
   * notes. If unspecified, the configuration file located in the repository at '.github/release.yml' or
   * '.github/release.yaml' will be used. If that is not present, the default configuration will be used.
   */
  public val configurationFilePath: String? = null,
  /**
   * The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range
   * for the set of changes considered as part this release.
   */
  public val previousTagName: String? = null,
  /**
   * Specifies the commitish value that will be the target for the release's tag. Required if the supplied tag_name does
   * not reference an existing tag. Ignored if the tag_name already exists.
   */
  public val targetCommitish: String? = null,
) {
  public class Builder {
    private var tagNameValue: String? = null

    public var tagName: String
      get() = requireNotNull(tagNameValue) { "tagName is required" }
      set(`value`) {
        tagNameValue = value
      }

    /**
     * Specifies a path to a file in the repository containing configuration settings used for generating the release
     * notes. If unspecified, the configuration file located in the repository at '.github/release.yml' or
     * '.github/release.yaml' will be used. If that is not present, the default configuration will be used.
     */
    public var configurationFilePath: String? = null

    /**
     * The name of the previous tag to use as the starting point for the release notes. Use to manually specify the
     * range for the set of changes considered as part this release.
     */
    public var previousTagName: String? = null

    /**
     * Specifies the commitish value that will be the target for the release's tag. Required if the supplied tag_name
     * does not reference an existing tag. Ignored if the tag_name already exists.
     */
    public var targetCommitish: String? = null

    public fun build(): InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc {
      check(tagNameValue != null) { "tagName is required" }
      return InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc(
        tagName = tagName,
        configurationFilePath = configurationFilePath,
        previousTagName = previousTagName,
        targetCommitish = targetCommitish,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc must be a JSON object")
      val tagName = json.decodeRequired<String>(rawObject, "tag_name")
      return InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc(
        tagName = tagName,
        configurationFilePath = rawObject["configuration_file_path"]?.let { json.decodeFromJsonElement<String>(it) },
        previousTagName = rawObject["previous_tag_name"]?.let { json.decodeFromJsonElement<String>(it) },
        targetCommitish = rawObject["target_commitish"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tag_name", value.tagName)
        value.configurationFilePath?.let { put("configuration_file_path", it) }
        value.previousTagName?.let { put("previous_tag_name", it) }
        value.targetCommitish?.let { put("target_commitish", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc(block: InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc.Builder.() -> Unit): InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc = InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposReleasesGenerateNotesPostRequestJsonX97a0dafc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
