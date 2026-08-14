package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details about the codespace's git repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace-with-full-repository/properties/git_status
 */
@Serializable(with = InlineCodespaceWithFullRepositoryGitStatusX20871eed.Serializer::class)
public class InlineCodespaceWithFullRepositoryGitStatusX20871eed(
  /**
   * The number of commits the local repository is ahead of the remote.
   */
  public val ahead: Int? = null,
  /**
   * The number of commits the local repository is behind the remote.
   */
  public val behind: Int? = null,
  /**
   * Whether the local repository has uncommitted changes.
   */
  public val hasUncommittedChanges: Boolean? = null,
  /**
   * Whether the local repository has unpushed changes.
   */
  public val hasUnpushedChanges: Boolean? = null,
  /**
   * The current branch (or SHA if in detached HEAD state) of the local repository.
   */
  public val ref: String? = null,
) {
  public class Builder {
    /**
     * The number of commits the local repository is ahead of the remote.
     */
    public var ahead: Int? = null

    /**
     * The number of commits the local repository is behind the remote.
     */
    public var behind: Int? = null

    /**
     * Whether the local repository has uncommitted changes.
     */
    public var hasUncommittedChanges: Boolean? = null

    /**
     * Whether the local repository has unpushed changes.
     */
    public var hasUnpushedChanges: Boolean? = null

    /**
     * The current branch (or SHA if in detached HEAD state) of the local repository.
     */
    public var ref: String? = null

    public fun build(): InlineCodespaceWithFullRepositoryGitStatusX20871eed = InlineCodespaceWithFullRepositoryGitStatusX20871eed(
      ahead = ahead,
      behind = behind,
      hasUncommittedChanges = hasUncommittedChanges,
      hasUnpushedChanges = hasUnpushedChanges,
      ref = ref,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodespaceWithFullRepositoryGitStatusX20871eed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodespaceWithFullRepositoryGitStatusX20871eed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodespaceWithFullRepositoryGitStatusX20871eed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodespaceWithFullRepositoryGitStatusX20871eed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodespaceWithFullRepositoryGitStatusX20871eed must be a JSON object")
      return InlineCodespaceWithFullRepositoryGitStatusX20871eed(
        ahead = rawObject["ahead"]?.let { json.decodeFromJsonElement<Int>(it) },
        behind = rawObject["behind"]?.let { json.decodeFromJsonElement<Int>(it) },
        hasUncommittedChanges = rawObject["has_uncommitted_changes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasUnpushedChanges = rawObject["has_unpushed_changes"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceWithFullRepositoryGitStatusX20871eed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodespaceWithFullRepositoryGitStatusX20871eed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ahead?.let { put("ahead", json.encodeToJsonElement(it)) }
        value.behind?.let { put("behind", json.encodeToJsonElement(it)) }
        value.hasUncommittedChanges?.let { put("has_uncommitted_changes", json.encodeToJsonElement(it)) }
        value.hasUnpushedChanges?.let { put("has_unpushed_changes", json.encodeToJsonElement(it)) }
        value.ref?.let { put("ref", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodespaceWithFullRepositoryGitStatusX20871eed(block: InlineCodespaceWithFullRepositoryGitStatusX20871eed.Builder.() -> Unit): InlineCodespaceWithFullRepositoryGitStatusX20871eed = InlineCodespaceWithFullRepositoryGitStatusX20871eed.build(block)
