package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

public sealed class BashServerToolEnvironmentDecodingException(
  message: String,
) : SerializationException(message)

public class BashServerToolEnvironmentNoMatchException(
  message: String,
) : BashServerToolEnvironmentDecodingException(message)

public class BashServerToolEnvironmentAmbiguityException(
  message: String,
) : BashServerToolEnvironmentDecodingException(message)

/**
 * Execution environment for the bash server tool.
 */
@Serializable(with = BashServerToolEnvironment.Serializer::class)
public sealed interface BashServerToolEnvironment {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ContainerAutoEnvironment internal constructor(
    public val type: InlineComponentsSchemasContainerAutoEnvironmentPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : BashServerToolEnvironment {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasContainerAutoEnvironmentPropertiesType): ContainerAutoEnvironment =
        ContainerAutoEnvironment(
        type = type,
        raw = buildJsonObject {
          put("type", "container_auto")
        },
      )
    }
  }

  public class ContainerReferenceEnvironment internal constructor(
    public val containerId: String,
    public val type: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : BashServerToolEnvironment {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(containerId: String,
        type: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType): ContainerReferenceEnvironment =
          ContainerReferenceEnvironment(
        containerId = containerId,
        type = type,
        raw = buildJsonObject {
          put("container_id", containerId)
          put("type", "container_reference")
        },
      )
    }
  }

  public object Serializer : KSerializer<BashServerToolEnvironment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BashServerToolEnvironment {
      val jsonDecoder = decoder.requireJsonDecoder("BashServerToolEnvironment")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw BashServerToolEnvironmentNoMatchException("BashServerToolEnvironment matched 0 branches: expected JSON " +
          "object")
      val matches = inspectBashServerToolEnvironment(raw)
      if (matches.size == 0) {
        throw BashServerToolEnvironmentNoMatchException("BashServerToolEnvironment matched 0 branches: " + matches
          .failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw BashServerToolEnvironmentAmbiguityException("BashServerToolEnvironment matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches -> ContainerAutoEnvironment(type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Matches && matches.containerIdDecoded -> ContainerReferenceEnvironment(containerId =
          requireNotNull(matches.containerId), type = requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: BashServerToolEnvironment) {
      encoder.requireJsonEncoder("BashServerToolEnvironment").encodeJsonElement(value.raw)
    }
  }
}

private data class BashServerToolEnvironmentInspection(
  public val typeState1: InlineComponentsSchemasContainerAutoEnvironmentPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val typeState2: InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val containerId: String?,
  public val containerIdDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches) add("ContainerAutoEnvironment")
      if (typeState2Matches && containerIdDecoded) add("ContainerReferenceEnvironment")
    }

  public val size: Int
    get() = names.size
}

private fun inspectBashServerToolEnvironment(raw: JsonObject): BashServerToolEnvironmentInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContainerAutoEnvironmentPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "container_auto" && typeState1Decoded
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContainerReferenceEnvironmentPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "container_reference" && typeState2Decoded
  val containerIdResult = raw["container_id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val containerId = containerIdResult?.getOrNull()
  val containerIdDecoded = containerIdResult?.isSuccess == true
  return BashServerToolEnvironmentInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    containerId = containerId,
    containerIdDecoded = containerIdDecoded,
    failures = buildList {
      if (!typeState1Matches) add("ContainerAutoEnvironment: required properties 'type' do not match their declared " +
        "types")
      if (!typeState2Matches ||
        !containerIdDecoded) add("ContainerReferenceEnvironment: required properties 'type' and 'container_id' do not " +
          "match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
