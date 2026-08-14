package io.github.nabobery.sdkgen.github.generated.classroom

import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import io.github.nabobery.sdkgen.github.generated.BasicError
import io.github.nabobery.sdkgen.github.generated.Classroom
import io.github.nabobery.sdkgen.github.generated.ClassroomAcceptedAssignment
import io.github.nabobery.sdkgen.github.generated.ClassroomAssignment
import io.github.nabobery.sdkgen.github.generated.ClassroomAssignmentGrade
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.SimpleClassroom
import io.github.nabobery.sdkgen.github.generated.SimpleClassroomAssignment
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

internal object ClassroomCodecs {
  internal const val CLASSROOMGETACLASSROOM_RESPONSE_CODEC_ID: String =
      "classroom/get-a-classroom.response"

  private val classroomGetAClassroomResponseCodec: MediaTypeCodec<Classroom> =
      KotlinxSerializationCodec(CLASSROOMGETACLASSROOM_RESPONSE_CODEC_ID, Classroom.Serializer, SdkJson)

  private val classroomGetAClassroomResponseCodecAlternative0Codec: MediaTypeCodec<Classroom> =
      KotlinxSerializationCodec("classroom/get-a-classroom.response.alternative0", Classroom.Serializer, SdkJson)

  internal val classroomGetAClassroomResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Classroom> =
      MediaTypeCodecRegistry.of(classroomGetAClassroomResponseCodecAlternative0Codec)

  private val classroomGetAClassroomResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("classroom/get-a-classroom.response.alternative1", BasicError.Serializer, SdkJson)

  internal val classroomGetAClassroomResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(classroomGetAClassroomResponseCodecAlternative1Codec)

  internal val classroomGetAClassroomRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val classroomGetAClassroomResponseCodecRegistry: MediaTypeCodecRegistry<Classroom> =
      MediaTypeCodecRegistry.of(classroomGetAClassroomResponseCodec)

  internal const val CLASSROOMGETANASSIGNMENT_RESPONSE_CODEC_ID: String =
      "classroom/get-an-assignment.response"

  private val classroomGetAnAssignmentResponseCodec: MediaTypeCodec<ClassroomAssignment> =
      KotlinxSerializationCodec(CLASSROOMGETANASSIGNMENT_RESPONSE_CODEC_ID, ClassroomAssignment.Serializer, SdkJson)

  private val classroomGetAnAssignmentResponseCodecAlternative0Codec:
      MediaTypeCodec<ClassroomAssignment> =
      KotlinxSerializationCodec("classroom/get-an-assignment.response.alternative0", ClassroomAssignment.Serializer, SdkJson)

  internal val classroomGetAnAssignmentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ClassroomAssignment> =
      MediaTypeCodecRegistry.of(classroomGetAnAssignmentResponseCodecAlternative0Codec)

  private val classroomGetAnAssignmentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("classroom/get-an-assignment.response.alternative1", BasicError.Serializer, SdkJson)

  internal val classroomGetAnAssignmentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(classroomGetAnAssignmentResponseCodecAlternative1Codec)

  internal val classroomGetAnAssignmentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val classroomGetAnAssignmentResponseCodecRegistry:
      MediaTypeCodecRegistry<ClassroomAssignment> =
      MediaTypeCodecRegistry.of(classroomGetAnAssignmentResponseCodec)

  internal const val CLASSROOMGETASSIGNMENTGRADES_RESPONSE_CODEC_ID: String =
      "classroom/get-assignment-grades.response"

  private val classroomGetAssignmentGradesResponseCodec:
      MediaTypeCodec<List<ClassroomAssignmentGrade>> =
      KotlinxSerializationCodec(CLASSROOMGETASSIGNMENTGRADES_RESPONSE_CODEC_ID, ListSerializer(ClassroomAssignmentGrade.Serializer), SdkJson)

  private val classroomGetAssignmentGradesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ClassroomAssignmentGrade>> =
      KotlinxSerializationCodec("classroom/get-assignment-grades.response.alternative0", ListSerializer(ClassroomAssignmentGrade.Serializer), SdkJson)

  internal val classroomGetAssignmentGradesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ClassroomAssignmentGrade>> =
      MediaTypeCodecRegistry.of(classroomGetAssignmentGradesResponseCodecAlternative0Codec)

  private val classroomGetAssignmentGradesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("classroom/get-assignment-grades.response.alternative1", BasicError.Serializer, SdkJson)

  internal val classroomGetAssignmentGradesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(classroomGetAssignmentGradesResponseCodecAlternative1Codec)

  internal val classroomGetAssignmentGradesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val classroomGetAssignmentGradesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ClassroomAssignmentGrade>> =
      MediaTypeCodecRegistry.of(classroomGetAssignmentGradesResponseCodec)

  internal const val CLASSROOMLISTACCEPTEDASSIGNMENTSFORANASSIGNMENT_RESPONSE_CODEC_ID: String =
      "classroom/list-accepted-assignments-for-an-assignment.response"

  private val classroomListAcceptedAssignmentsForAnAssignmentResponseCodec:
      MediaTypeCodec<List<ClassroomAcceptedAssignment>> =
      KotlinxSerializationCodec(CLASSROOMLISTACCEPTEDASSIGNMENTSFORANASSIGNMENT_RESPONSE_CODEC_ID, ListSerializer(ClassroomAcceptedAssignment.Serializer), SdkJson)

  private val classroomListAcceptedAssignmentsForAnAssignmentResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ClassroomAcceptedAssignment>> =
      KotlinxSerializationCodec("classroom/list-accepted-assignments-for-an-assignment.response.alternative0", ListSerializer(ClassroomAcceptedAssignment.Serializer), SdkJson)

  internal val classroomListAcceptedAssignmentsForAnAssignmentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ClassroomAcceptedAssignment>> =
      MediaTypeCodecRegistry.of(classroomListAcceptedAssignmentsForAnAssignmentResponseCodecAlternative0Codec)

  internal val classroomListAcceptedAssignmentsForAnAssignmentRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val classroomListAcceptedAssignmentsForAnAssignmentResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ClassroomAcceptedAssignment>> =
      MediaTypeCodecRegistry.of(classroomListAcceptedAssignmentsForAnAssignmentResponseCodec)

  internal const val CLASSROOMLISTASSIGNMENTSFORACLASSROOM_RESPONSE_CODEC_ID: String =
      "classroom/list-assignments-for-a-classroom.response"

  private val classroomListAssignmentsForAClassroomResponseCodec:
      MediaTypeCodec<List<SimpleClassroomAssignment>> =
      KotlinxSerializationCodec(CLASSROOMLISTASSIGNMENTSFORACLASSROOM_RESPONSE_CODEC_ID, ListSerializer(SimpleClassroomAssignment.Serializer), SdkJson)

  private val classroomListAssignmentsForAClassroomResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleClassroomAssignment>> =
      KotlinxSerializationCodec("classroom/list-assignments-for-a-classroom.response.alternative0", ListSerializer(SimpleClassroomAssignment.Serializer), SdkJson)

  internal val classroomListAssignmentsForAClassroomResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleClassroomAssignment>> =
      MediaTypeCodecRegistry.of(classroomListAssignmentsForAClassroomResponseCodecAlternative0Codec)

  internal val classroomListAssignmentsForAClassroomRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val classroomListAssignmentsForAClassroomResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleClassroomAssignment>> =
      MediaTypeCodecRegistry.of(classroomListAssignmentsForAClassroomResponseCodec)

  internal const val CLASSROOMLISTCLASSROOMS_RESPONSE_CODEC_ID: String =
      "classroom/list-classrooms.response"

  private val classroomListClassroomsResponseCodec: MediaTypeCodec<List<SimpleClassroom>> =
      KotlinxSerializationCodec(CLASSROOMLISTCLASSROOMS_RESPONSE_CODEC_ID, ListSerializer(SimpleClassroom.Serializer), SdkJson)

  private val classroomListClassroomsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleClassroom>> =
      KotlinxSerializationCodec("classroom/list-classrooms.response.alternative0", ListSerializer(SimpleClassroom.Serializer), SdkJson)

  internal val classroomListClassroomsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleClassroom>> =
      MediaTypeCodecRegistry.of(classroomListClassroomsResponseCodecAlternative0Codec)

  internal val classroomListClassroomsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val classroomListClassroomsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleClassroom>> =
      MediaTypeCodecRegistry.of(classroomListClassroomsResponseCodec)
}

/**
 * Client for the 'classroom' group of GitHub v3 REST API.
 */
public class ClassroomClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ClassroomClient.authentication)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Gets a GitHub Classroom classroom for the current user. Classroom will only be returned if the current user is an
   * administrator of the GitHub Classroom.
   *
   * @param classroomId The unique identifier of the classroom.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ClassroomGetAClassroomApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ClassroomGetAClassroomError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun classroomGetAClassroom(classroomId: Int, options: CallOptions = CallOptions()): Classroom = executor.executeWithTypedErrors<Unit, ClassroomGetAClassroomResponse, Classroom>(
    request = SdkExecutionRequest(classroomGetAClassroomMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "classroom_id", values = listOf(classroomId.toString())))
    }),
    requestCodecs = ClassroomCodecs.classroomGetAClassroomRequestCodecRegistry,
    responseDecoder = ClassroomGetAClassroomResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ClassroomGetAClassroomResponse.SuccessJson -> response.json
        is ClassroomGetAClassroomResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ClassroomGetAClassroomResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ClassroomGetAClassroomResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ClassroomGetAClassroomResponse.Http404Json -> ClassroomGetAClassroomApiException(response, statusCode, headers)
        is ClassroomGetAClassroomResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Gets a GitHub Classroom classroom for the current user. Classroom will only be returned if the current user is an
   * administrator of the GitHub Classroom.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param classroomId The unique identifier of the classroom.
   * @param options Execution options.
   */
  public suspend fun classroomGetAClassroomWithResponse(classroomId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ClassroomGetAClassroomResponse> = executor.executeWithResponse<Unit, ClassroomGetAClassroomResponse>(SdkExecutionRequest(classroomGetAClassroomMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "classroom_id", values = listOf(classroomId.toString())))
  }), ClassroomCodecs.classroomGetAClassroomRequestCodecRegistry, ClassroomGetAClassroomResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Gets a GitHub Classroom assignment. Assignment will only be returned if the current user is an administrator of the
   * GitHub Classroom for the assignment.
   *
   * @param assignmentId The unique identifier of the classroom assignment.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ClassroomGetAnAssignmentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ClassroomGetAnAssignmentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun classroomGetAnAssignment(assignmentId: Int, options: CallOptions = CallOptions()): ClassroomAssignment = executor.executeWithTypedErrors<Unit, ClassroomGetAnAssignmentResponse, ClassroomAssignment>(
    request = SdkExecutionRequest(classroomGetAnAssignmentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignment_id", values = listOf(assignmentId.toString())))
    }),
    requestCodecs = ClassroomCodecs.classroomGetAnAssignmentRequestCodecRegistry,
    responseDecoder = ClassroomGetAnAssignmentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ClassroomGetAnAssignmentResponse.SuccessJson -> response.json
        is ClassroomGetAnAssignmentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ClassroomGetAnAssignmentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ClassroomGetAnAssignmentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ClassroomGetAnAssignmentResponse.Http404Json -> ClassroomGetAnAssignmentApiException(response, statusCode, headers)
        is ClassroomGetAnAssignmentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Gets a GitHub Classroom assignment. Assignment will only be returned if the current user is an administrator of the
   * GitHub Classroom for the assignment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param assignmentId The unique identifier of the classroom assignment.
   * @param options Execution options.
   */
  public suspend fun classroomGetAnAssignmentWithResponse(assignmentId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ClassroomGetAnAssignmentResponse> = executor.executeWithResponse<Unit, ClassroomGetAnAssignmentResponse>(SdkExecutionRequest(classroomGetAnAssignmentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignment_id", values = listOf(assignmentId.toString())))
  }), ClassroomCodecs.classroomGetAnAssignmentRequestCodecRegistry, ClassroomGetAnAssignmentResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Gets grades for a GitHub Classroom assignment. Grades will only be returned if the current user is an administrator
   * of the GitHub Classroom for the assignment.
   *
   * @param assignmentId The unique identifier of the classroom assignment.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ClassroomGetAssignmentGradesApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ClassroomGetAssignmentGradesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun classroomGetAssignmentGrades(assignmentId: Int, options: CallOptions = CallOptions()): List<ClassroomAssignmentGrade> = executor.executeWithTypedErrors<Unit, ClassroomGetAssignmentGradesResponse, List<ClassroomAssignmentGrade>>(
    request = SdkExecutionRequest(classroomGetAssignmentGradesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignment_id", values = listOf(assignmentId.toString())))
    }),
    requestCodecs = ClassroomCodecs.classroomGetAssignmentGradesRequestCodecRegistry,
    responseDecoder = ClassroomGetAssignmentGradesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ClassroomGetAssignmentGradesResponse.SuccessJson -> response.json
        is ClassroomGetAssignmentGradesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ClassroomGetAssignmentGradesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ClassroomGetAssignmentGradesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ClassroomGetAssignmentGradesResponse.Http404Json -> ClassroomGetAssignmentGradesApiException(response, statusCode, headers)
        is ClassroomGetAssignmentGradesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Gets grades for a GitHub Classroom assignment. Grades will only be returned if the current user is an administrator
   * of the GitHub Classroom for the assignment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param assignmentId The unique identifier of the classroom assignment.
   * @param options Execution options.
   */
  public suspend fun classroomGetAssignmentGradesWithResponse(assignmentId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ClassroomGetAssignmentGradesResponse> = executor.executeWithResponse<Unit, ClassroomGetAssignmentGradesResponse>(SdkExecutionRequest(classroomGetAssignmentGradesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignment_id", values = listOf(assignmentId.toString())))
  }), ClassroomCodecs.classroomGetAssignmentGradesRequestCodecRegistry, ClassroomGetAssignmentGradesResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Lists any assignment repositories that have been created by students accepting a GitHub Classroom assignment.
   * Accepted assignments will only be returned if the current user is an administrator of the GitHub Classroom for the
   * assignment.
   *
   * @param assignmentId The unique identifier of the classroom assignment.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun classroomListAcceptedAssignmentsForAnAssignment(
    assignmentId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<ClassroomAcceptedAssignment> = executor.execute<Unit, List<ClassroomAcceptedAssignment>>(SdkExecutionRequest(classroomListAcceptedAssignmentsForAnAssignmentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignment_id", values = listOf(assignmentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ClassroomCodecs.CLASSROOMLISTACCEPTEDASSIGNMENTSFORANASSIGNMENT_RESPONSE_CODEC_ID), ClassroomCodecs.classroomListAcceptedAssignmentsForAnAssignmentRequestCodecRegistry, ClassroomCodecs.classroomListAcceptedAssignmentsForAnAssignmentResponseCodecRegistry, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Lists any assignment repositories that have been created by students accepting a GitHub Classroom assignment.
   * Accepted assignments will only be returned if the current user is an administrator of the GitHub Classroom for the
   * assignment.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param assignmentId The unique identifier of the classroom assignment.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun classroomListAcceptedAssignmentsForAnAssignmentWithResponse(
    assignmentId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ClassroomListAcceptedAssignmentsForAnAssignmentResponse> = executor.executeWithResponse<Unit, ClassroomListAcceptedAssignmentsForAnAssignmentResponse>(SdkExecutionRequest(classroomListAcceptedAssignmentsForAnAssignmentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignment_id", values = listOf(assignmentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ClassroomCodecs.classroomListAcceptedAssignmentsForAnAssignmentRequestCodecRegistry, ClassroomListAcceptedAssignmentsForAnAssignmentResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Lists GitHub Classroom assignments for a classroom. Assignments will only be returned if the current user is an
   * administrator of the GitHub Classroom.
   *
   * @param classroomId The unique identifier of the classroom.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun classroomListAssignmentsForAClassroom(
    classroomId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleClassroomAssignment> = executor.execute<Unit, List<SimpleClassroomAssignment>>(SdkExecutionRequest(classroomListAssignmentsForAClassroomMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "classroom_id", values = listOf(classroomId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ClassroomCodecs.CLASSROOMLISTASSIGNMENTSFORACLASSROOM_RESPONSE_CODEC_ID), ClassroomCodecs.classroomListAssignmentsForAClassroomRequestCodecRegistry, ClassroomCodecs.classroomListAssignmentsForAClassroomResponseCodecRegistry, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Lists GitHub Classroom assignments for a classroom. Assignments will only be returned if the current user is an
   * administrator of the GitHub Classroom.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param classroomId The unique identifier of the classroom.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun classroomListAssignmentsForAClassroomWithResponse(
    classroomId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ClassroomListAssignmentsForAClassroomResponse> = executor.executeWithResponse<Unit, ClassroomListAssignmentsForAClassroomResponse>(SdkExecutionRequest(classroomListAssignmentsForAClassroomMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "classroom_id", values = listOf(classroomId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ClassroomCodecs.classroomListAssignmentsForAClassroomRequestCodecRegistry, ClassroomListAssignmentsForAClassroomResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Lists GitHub Classroom classrooms for the current user. Classrooms will only be returned if the current user is an
   * administrator of one or more GitHub Classrooms.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun classroomListClassrooms(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleClassroom> = executor.execute<Unit, List<SimpleClassroom>>(SdkExecutionRequest(classroomListClassroomsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ClassroomCodecs.CLASSROOMLISTCLASSROOMS_RESPONSE_CODEC_ID), ClassroomCodecs.classroomListClassroomsRequestCodecRegistry, ClassroomCodecs.classroomListClassroomsResponseCodecRegistry, options)

  /**
   * > [!WARNING]
   * > **Closing down notice:** This operation is closing down and will be removed on August 28, 2026.
   * > For more information, see the [GitHub Classroom sunset notice](https://gh.io/classroom-sunset).
   *
   * Lists GitHub Classroom classrooms for the current user. Classrooms will only be returned if the current user is an
   * administrator of one or more GitHub Classrooms.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun classroomListClassroomsWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ClassroomListClassroomsResponse> = executor.executeWithResponse<Unit, ClassroomListClassroomsResponse>(SdkExecutionRequest(classroomListClassroomsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ClassroomCodecs.classroomListClassroomsRequestCodecRegistry, ClassroomListClassroomsResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `classroom/get-a-classroom` may expose through its typed API
   * exception.
   */
  public sealed interface ClassroomGetAClassroomError

  /**
   * Typed response alternatives for `classroom/get-a-classroom`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ClassroomGetAClassroomResponse {
    public class SuccessJson(
      public val json: Classroom,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAClassroomResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAClassroomResponse,
        ClassroomGetAClassroomError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAClassroomResponse
  }

  /**
   * Raised by `classroom/get-a-classroom` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ClassroomGetAClassroomApiException(
    public val error: ClassroomGetAClassroomError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "classroom/get-a-classroom")

  private object ClassroomGetAClassroomResponseDecoder : SdkResponseAlternativeDecoder<ClassroomGetAClassroomResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ClassroomGetAClassroomResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ClassroomGetAClassroomResponse> = when {
      alternative.id == "classroom/get-a-classroom.response.alternative0" -> SdkResponseDecodeResult(
        value = ClassroomGetAClassroomResponse.SuccessJson(
          json = ClassroomCodecs.classroomGetAClassroomResponseCodecAlternative0Registry.select(listOf("classroom/get-a-classroom.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "classroom/get-a-classroom.response.alternative1" -> SdkResponseDecodeResult(
        value = ClassroomGetAClassroomResponse.Http404Json(
          json = ClassroomCodecs.classroomGetAClassroomResponseCodecAlternative1Registry.select(listOf("classroom/get-a-classroom.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ClassroomGetAClassroomResponse = ClassroomGetAClassroomResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `classroom/get-an-assignment` may expose through its typed API
   * exception.
   */
  public sealed interface ClassroomGetAnAssignmentError

  /**
   * Typed response alternatives for `classroom/get-an-assignment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ClassroomGetAnAssignmentResponse {
    public class SuccessJson(
      public val json: ClassroomAssignment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAnAssignmentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAnAssignmentResponse,
        ClassroomGetAnAssignmentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAnAssignmentResponse
  }

  /**
   * Raised by `classroom/get-an-assignment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ClassroomGetAnAssignmentApiException(
    public val error: ClassroomGetAnAssignmentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "classroom/get-an-assignment")

  private object ClassroomGetAnAssignmentResponseDecoder : SdkResponseAlternativeDecoder<ClassroomGetAnAssignmentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ClassroomGetAnAssignmentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ClassroomGetAnAssignmentResponse> = when {
      alternative.id == "classroom/get-an-assignment.response.alternative0" -> SdkResponseDecodeResult(
        value = ClassroomGetAnAssignmentResponse.SuccessJson(
          json = ClassroomCodecs.classroomGetAnAssignmentResponseCodecAlternative0Registry.select(listOf("classroom/get-an-assignment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "classroom/get-an-assignment.response.alternative1" -> SdkResponseDecodeResult(
        value = ClassroomGetAnAssignmentResponse.Http404Json(
          json = ClassroomCodecs.classroomGetAnAssignmentResponseCodecAlternative1Registry.select(listOf("classroom/get-an-assignment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ClassroomGetAnAssignmentResponse = ClassroomGetAnAssignmentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `classroom/get-assignment-grades` may expose through its typed API
   * exception.
   */
  public sealed interface ClassroomGetAssignmentGradesError

  /**
   * Typed response alternatives for `classroom/get-assignment-grades`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ClassroomGetAssignmentGradesResponse {
    public class SuccessJson(
      public val json: List<ClassroomAssignmentGrade>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAssignmentGradesResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAssignmentGradesResponse,
        ClassroomGetAssignmentGradesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomGetAssignmentGradesResponse
  }

  /**
   * Raised by `classroom/get-assignment-grades` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ClassroomGetAssignmentGradesApiException(
    public val error: ClassroomGetAssignmentGradesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "classroom/get-assignment-grades")

  private object ClassroomGetAssignmentGradesResponseDecoder : SdkResponseAlternativeDecoder<ClassroomGetAssignmentGradesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ClassroomGetAssignmentGradesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ClassroomGetAssignmentGradesResponse> = when {
      alternative.id == "classroom/get-assignment-grades.response.alternative0" -> SdkResponseDecodeResult(
        value = ClassroomGetAssignmentGradesResponse.SuccessJson(
          json = ClassroomCodecs.classroomGetAssignmentGradesResponseCodecAlternative0Registry.select(listOf("classroom/get-assignment-grades.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "classroom/get-assignment-grades.response.alternative1" -> SdkResponseDecodeResult(
        value = ClassroomGetAssignmentGradesResponse.Http404Json(
          json = ClassroomCodecs.classroomGetAssignmentGradesResponseCodecAlternative1Registry.select(listOf("classroom/get-assignment-grades.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ClassroomGetAssignmentGradesResponse = ClassroomGetAssignmentGradesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `classroom/list-accepted-assignments-for-an-assignment`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface ClassroomListAcceptedAssignmentsForAnAssignmentResponse {
    public class SuccessJson(
      public val json: List<ClassroomAcceptedAssignment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomListAcceptedAssignmentsForAnAssignmentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomListAcceptedAssignmentsForAnAssignmentResponse
  }

  private object ClassroomListAcceptedAssignmentsForAnAssignmentResponseDecoder : SdkResponseAlternativeDecoder<ClassroomListAcceptedAssignmentsForAnAssignmentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ClassroomListAcceptedAssignmentsForAnAssignmentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ClassroomListAcceptedAssignmentsForAnAssignmentResponse> = when {
      alternative.id == "classroom/list-accepted-assignments-for-an-assignment.response.alternative0" -> SdkResponseDecodeResult(
        value = ClassroomListAcceptedAssignmentsForAnAssignmentResponse.SuccessJson(
          json = ClassroomCodecs.classroomListAcceptedAssignmentsForAnAssignmentResponseCodecAlternative0Registry.select(listOf("classroom/list-accepted-assignments-for-an-assignment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ClassroomListAcceptedAssignmentsForAnAssignmentResponse = ClassroomListAcceptedAssignmentsForAnAssignmentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `classroom/list-assignments-for-a-classroom`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface ClassroomListAssignmentsForAClassroomResponse {
    public class SuccessJson(
      public val json: List<SimpleClassroomAssignment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomListAssignmentsForAClassroomResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomListAssignmentsForAClassroomResponse
  }

  private object ClassroomListAssignmentsForAClassroomResponseDecoder : SdkResponseAlternativeDecoder<ClassroomListAssignmentsForAClassroomResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ClassroomListAssignmentsForAClassroomResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ClassroomListAssignmentsForAClassroomResponse> = when {
      alternative.id == "classroom/list-assignments-for-a-classroom.response.alternative0" -> SdkResponseDecodeResult(
        value = ClassroomListAssignmentsForAClassroomResponse.SuccessJson(
          json = ClassroomCodecs.classroomListAssignmentsForAClassroomResponseCodecAlternative0Registry.select(listOf("classroom/list-assignments-for-a-classroom.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ClassroomListAssignmentsForAClassroomResponse = ClassroomListAssignmentsForAClassroomResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `classroom/list-classrooms`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ClassroomListClassroomsResponse {
    public class SuccessJson(
      public val json: List<SimpleClassroom>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomListClassroomsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ClassroomListClassroomsResponse
  }

  private object ClassroomListClassroomsResponseDecoder : SdkResponseAlternativeDecoder<ClassroomListClassroomsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ClassroomListClassroomsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ClassroomListClassroomsResponse> = when {
      alternative.id == "classroom/list-classrooms.response.alternative0" -> SdkResponseDecodeResult(
        value = ClassroomListClassroomsResponse.SuccessJson(
          json = ClassroomCodecs.classroomListClassroomsResponseCodecAlternative0Registry.select(listOf("classroom/list-classrooms.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ClassroomListClassroomsResponse = ClassroomListClassroomsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val classroomGetAClassroomMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "classroom/get-a-classroom",
          method = "GET",
          path = "/classrooms/{classroom_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Classroom",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/get-a-classroom.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/get-a-classroom.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val classroomGetAnAssignmentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "classroom/get-an-assignment",
          method = "GET",
          path = "/assignments/{assignment_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ClassroomAssignment",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/get-an-assignment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/get-an-assignment.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val classroomGetAssignmentGradesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "classroom/get-assignment-grades",
          method = "GET",
          path = "/assignments/{assignment_id}/grades",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/get-assignment-grades.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/get-assignment-grades.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val classroomListAcceptedAssignmentsForAnAssignmentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "classroom/list-accepted-assignments-for-an-assignment",
          method = "GET",
          path = "/assignments/{assignment_id}/accepted_assignments",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/list-accepted-assignments-for-an-assignment.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val classroomListAssignmentsForAClassroomMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "classroom/list-assignments-for-a-classroom",
          method = "GET",
          path = "/classrooms/{classroom_id}/assignments",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/list-assignments-for-a-classroom.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val classroomListClassroomsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "classroom/list-classrooms",
          method = "GET",
          path = "/classrooms",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "classroom/list-classrooms.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
